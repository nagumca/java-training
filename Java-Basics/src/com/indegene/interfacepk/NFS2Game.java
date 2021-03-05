package com.indegene.interfacepk;

public class NFS2Game implements Remote {

	@Override
	public void right() {
		System.out.println("NFS2Game RIGHT button pressed");
	}

	@Override
	public void left() {
		System.out.println("NFS2Game LEFT button pressed");
		
	}

	@Override
	public void up() {
		System.out.println("NFS2Game UP button pressed");
	}

	@Override
	public void down() {
		System.out.println("NFS2Game DOWN button pressed");
	}

}
