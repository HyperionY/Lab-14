package edu.handong.csee.lab14.prob01;
import java.util.Scanner;		// import java library 'java.util.Scanner'
import java.util.Random;		// import java library 'java.util.Random'

public class Prob01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		// set new Scanner(System.in) as the Scanner type variable 'keyboard'
		Random rand = new Random();		// set the new random number 'rand'
		int limit = 0, speed = 0;		// set the local variable limit and speed as '0'

		System.out.print("Set the speed limit, officer: ");		// print out on console as "Set the speed limit, officer: "
		limit = keyboard.nextInt();		// get the int value into limit
		speed = rand.nextInt(101);		// get the random int value(0 ~ 100)

		SpeedLimter lim = new SpeedLimter(limit, speed);		// set the SpeedLimter(limit, speed) as SpeedLimter type variable lim

		lim.warnSpeedLimit();		// activated warnSpeedLimit() method in lim

		keyboard.close();		// off the keyboard


	}

}
