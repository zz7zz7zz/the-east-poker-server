package com.poker.access.handler;

import com.poker.access.Main;
import com.poker.data.DataTransfer;

public class ImplDataTransfer{
	
	public static int send2Access(byte[] writeBuff,int squenceId, byte[] data, int offset ,int length){
		int dst_server_id = Main.libArgsConfig.id;
		return DataTransfer.send2Access(writeBuff,squenceId,data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,-1,-1);
	}
	
	public static int send2Login(byte[] writeBuff,int squenceId, byte[] data, int offset ,int length){
		int dst_server_id = Main.libArgsConfig.id;
		return DataTransfer.send2Login(writeBuff,squenceId,data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,-1,-1);
	}
	
	public static int send2User(byte[] writeBuff,int squenceId , byte[] data, int offset ,int length){
		int dst_server_id = Main.libArgsConfig.id;
		return DataTransfer.send2User(writeBuff,squenceId, data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,-1,-1);
	}
	
	public static int send2Allocator(byte[] writeBuff,int squenceId , byte[] data, int offset ,int length){
		int dst_server_id = Main.libArgsConfig.id;
		return DataTransfer.send2Allocator(writeBuff,squenceId, data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,-1,-1);
	}
	
//	public static int send2Gamer(byte[] writeBuff,int squenceId, int cmd , byte[] data, int offset ,int length){
//		int dst_server_id = Main.libArgsConfig.id;
//		int gameGroup = Main.mServerConfig.game_id;
//		DataTransfer.send2Gamer(writeBuff,squenceId, data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,gameGroup,-1);
//		return 1;
//	}
//	
//	public static int send2GamerGroup(byte[] writeBuff,int squenceId, int cmd , byte[] data, int offset ,int length){
//		int dst_server_id = Main.libArgsConfig.id;
//		int gameGroup = Main.mServerConfig.game_id;
//		DataTransfer.send2Gamer(writeBuff,squenceId, data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,gameGroup,-1);
//		return 1;
//	}
	
	public static int send2GoldCoin(byte[] writeBuff,int squenceId, int cmd , byte[] data, int offset ,int length){
		int dst_server_id = Main.libArgsConfig.id;
		return DataTransfer.send2GoldCoin(writeBuff,squenceId, data,offset,length, Main.libArgsConfig.server_type, Main.libArgsConfig.id, dst_server_id,-1,-1);
	}
}