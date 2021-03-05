package com.indegene.interfacepk;

public class TempleRunGame implements Remote {

	@Override
	public void right() {
		System.out.println("TempleRunGame RIGHT button pressed");
	}

	@Override
	public void left() {
		System.out.println("TempleRunGame LEFT button pressed");
	}

	@Override
	public void up() {
		System.out.println("TempleRunGame UP button pressed");
	}

	@Override
	public void down() {
		System.out.println("TempleRunGame DOWN button pressed");
	}

}
