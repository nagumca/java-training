package com.indegene.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(120);
		MotorBike honda = new MotorBike(80);
		MotorBike suzuki = new MotorBike(70);
		
		ducati.start();
		honda.start();
		suzuki.start();
		
		ducati.increaseSpeed(50);
		
		honda.increaseSpeed(40);
		
		ducati.decreaseSpeed(10);
		
		System.out.println("ducati speed : "+ducati.getSpeed());
		System.out.println("honda speed : "+honda.getSpeed());
		System.out.println("suzuki speed : "+suzuki.getSpeed()); 
		
		
	}
}
