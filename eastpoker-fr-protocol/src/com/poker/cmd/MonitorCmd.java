package com.poker.cmd;

import com.poker.base.Server;

public final class MonitorCmd {
	
	public static final int CMD_REGISTER = (Server.SERVER_MONITOR <<16) + 1;//0x10002
	
	public static final int CMD_UNREGISTER  = (Server.SERVER_MONITOR <<16) + 2;//0x10002
	
}