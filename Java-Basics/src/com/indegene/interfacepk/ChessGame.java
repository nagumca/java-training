package com.indegene.interfacepk;

public class ChessGame implements Remote,TVRemote {

	@Override
	public void right() {
		System.out.println("ChessGame RIGHT button pressed");
	}

	@Override
	public void left() {
		System.out.println("ChessGame LEFT button pressed");
	}

	@Override
	public void up() {
		System.out.println("ChessGame UP button pressed");
	}

	@Override
	public void down() {
		System.out.println("ChessGame DOWN button pressed");
	}

	@Override
	public void switchOn() {
		System.out.println("Switching On the TV for Chess Game");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Switching Off the TV for Chess Game");
		
	}
	
}
