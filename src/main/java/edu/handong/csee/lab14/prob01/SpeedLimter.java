package edu.handong.csee.lab14.prob01;

public class SpeedLimter {		// this class define for ckeck the speed
	private int speed = 0;		// set int type variable 'speed' as 0
	private int limit = 0;		// set int type variable 'limit' as 0
	
	public SpeedLimter (int speed, int limit) {		// if SpeedLimter get the speed and limit value, actived this method
		this.speed = speed;		// set class speed variable as input speed variable
		this.limit = limit;		// set class limit variable as input limit variable
	}
	
	public void warnSpeedLimit() {		// this method check for over the speed
		try {
			if(this.speed > this.limit) {
				throw new Exception("Speed Limit " + this.limit + "km exceeded");		// if speed larger than limit throw exception message
			}
			System.out.println("You are a law abiding citizen!");		// print out on console as "You are a law abiding citizen!"
		}
		catch(Exception e) {		// if get the exception message activated under line command
			System.out.println("e.getMessage()");		// print out the exception message on console
			System.out.println("You are being fined. ");		// print out on cosole as "You are being fined. "
		}
		System.out.println("Your current speed: " + this.speed);		// print out on console as "Your current speed: " and speed value
	}
	
}
