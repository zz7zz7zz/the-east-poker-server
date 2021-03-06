package com.poker.base.type;

/**
 * 游戏类型
 * @author Administrator
 */
public final class TGame {
	
	//间隔100，是由于同一种纸牌可能有多个玩法，为了让同一个游戏游戏ID具有连续性
	public static final int TEXAS_HOLD_EM_POKER = 500;
	
	//三人斗地主
	public static final int THREE_POKER = 600;
	
	//问答
	public static final int QA = 700;
}
