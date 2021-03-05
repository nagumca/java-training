package com.indegene.oops;

public class MotorBike {
	private int speed;	// state (or) member variable
	
	MotorBike(int speed){
		setSpeed(speed);
	}
	
	void start() {	// behaviour (or) method (or) function
		System.out.println("Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0)
			this.speed = speed;
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed (	speed + howMuch );
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed( speed - howMuch );
	}
}
