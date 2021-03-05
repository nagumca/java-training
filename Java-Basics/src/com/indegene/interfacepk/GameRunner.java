package com.indegene.interfacepk;

public class GameRunner {
	public static void main(String[] args) {
		Remote remote = new TempleRunGame();		// create different game object
		ChessGame remote2 = new ChessGame();
		
		remote.right();
		remote.left();
		remote.up();
		remote.down();
		
		System.out.println("");
		remote2.switchOn();
		remote2.right();
		remote2.left();
		remote2.up();
		remote2.down();
		remote2.switchOff();
	}
}
