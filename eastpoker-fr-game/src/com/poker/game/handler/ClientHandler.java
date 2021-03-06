package com.poker.game.handler;

import com.google.protobuf.InvalidProtocolBufferException;
import com.open.net.base.util.ExceptionUtil;
import com.open.net.client.object.AbstractClient;
import com.open.net.client.object.AbstractClientMessageProcessor;

import com.open.util.log.Logger;
import com.poker.base.cmd.CmdAllocator;
import com.poker.base.cmd.Cmd;
import com.poker.base.packet.BasePacket;
import com.poker.base.packet.InPacket;
import com.poker.base.packet.OutPacket;
import com.poker.base.packet.PacketTransfer;
import com.poker.base.type.TDistapch;
import com.poker.common.config.Config;
import com.poker.game.Main;
import com.poker.games.Room;
import com.poker.games.AbsTable;
import com.poker.protocols.game.server.GameServerProto;
import com.poker.protocols.game.server.GameTableProto;

public class ClientHandler extends AbsClientHandler{
	
	public ClientHandler(InPacket mInPacket, OutPacket mOutPacket) {
		super(mInPacket, mOutPacket);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispatchMessage(AbstractClient client, byte[] data, int header_start, int header_length, int body_start,
			int body_length) {
		try {
			int cmd   = BasePacket.getCmd(data, header_start);
    		Logger.v("input_packet cmd 0x" + Integer.toHexString(cmd) + " name " + Cmd.getCmdString(cmd) + " length " + BasePacket.getLength(data,header_start));
    		
    		//先判断游戏外逻辑，再判断游戏内逻辑
        	if(cmd == CmdAllocator.CMD_ALLOCATOR_BROADCAST_GET_ROOMINFO){
        		on_get_roominfo(client,1,this,Main.mServerConfig,Main.mRoom);
        	}else{
        		Main.mRoom.dispatchRoomMessage(cmd, data, header_start, header_length, body_start, body_length);
        	}
		} catch (Exception e) {
			e.printStackTrace();
			Logger.v(ExceptionUtil.getStackTraceString(e));
		}
	}
	
	boolean isReported = false;
	public int report_roominfo(AbstractClient client,int squenceId,AbstractClientMessageProcessor sender,Config config){
		if(!isReported){
			isReported = true;
			GameServerProto.GameServer.Builder builder = GameServerProto.GameServer.newBuilder();
			builder.setServerId(config.server_id);
			builder.setGameId(config.game_id);
			builder.setGameLevel(config.game_level);
			builder.setTableCount(config.table_count);
			builder.setTableMaxUser(config.table_max_user);
			
			byte[] body = builder.build().toByteArray();

			int dst_server_id = Main.mServerConfig.game_id;
			int dispatch_type = TDistapch.TYPE_P2P;
			int length = PacketTransfer.send2Alloc(dst_server_id, mOutPacket.getPacket(), squenceId, 0, CmdAllocator.CMD_GAMESERVER_TO_ALLOCATOR_REPORT_ROOMINFO, dispatch_type, body,0, body.length);
			sender.send(client, mOutPacket.getPacket(), 0, length);
			return 1;
		}
		return 0;
	}
	
	public int on_get_roominfo(AbstractClient client, int squenceId,AbstractClientMessageProcessor sender,Config config,Room mRoom) throws InvalidProtocolBufferException{
		GameServerProto.GameServer.Builder builder = GameServerProto.GameServer.newBuilder();
		builder.setServerId(config.server_id);
		builder.setGameId(config.game_id);
		builder.setGameLevel(config.game_level);
		builder.setTableCount(config.table_count);
		builder.setTableMaxUser(config.table_max_user);
		
		for (AbsTable table : mRoom.mTables) {
			GameTableProto.GameTable.Builder tableBuilder = GameTableProto.GameTable.newBuilder();
			tableBuilder.setTid(table.tableId);
			tableBuilder.setCount(table.getUserCount());
			builder.addTableList(tableBuilder);
		}
		
		byte[] body = builder.build().toByteArray();
		
		int dst_server_id = Main.mServerConfig.game_id;
		int dispatch_type = TDistapch.TYPE_P2P;
		int length = PacketTransfer.send2Alloc(dst_server_id, mOutPacket.getPacket(), squenceId, 0, CmdAllocator.CMD_ALLOCATOR_BROADCAST_GET_ROOMINFO, dispatch_type, body,0, body.length);
		sender.send(client, mOutPacket.getPacket(), 0, length);
		return 1;
	}


}
