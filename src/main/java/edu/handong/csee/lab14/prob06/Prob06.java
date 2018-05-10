package edu.handong.csee.lab14.prob06;
import java.util.Scanner;		// import java library 'java.util.Scanner'

public class Prob06 {

	public static void main(String[] args) {
		String name, race;		// set String type local variable name and race
		int age = 0;		// set int type local variable age as 0
		Scanner keyboard = new Scanner(System.in);		// set Scanner as keyboard
		CustomID obj = new CustomID();		// set CustomID() as obj
		boolean repeat = true;		// set boolean type local variable repeat as true

		while(repeat) {		// loop until repaet is false
			try {
				if(obj.getState() == 0) {		// if result of getState() equal 0 activated under line commands
					System.out.print("Enter your name: ");		// print out on console as "Enter your name: "
					name = keyboard.nextLine();		// get String type value into name
					obj.set_name(name);		// activated set_name in obj class and input is name
				}
				else if(obj.getState() == 1) {		// if result of getState() equal 1 activated under line commands
					System.out.print("Enter your age: ");		// print out on console as "Enter your age: "
					age = keyboard.nextInt();		// get int type value into age
					keyboard.nextLine();		// get String type value to get 'Enter' value
					obj.set_age(age);		// activated set_age in obj class and input is age
				}
				else if(obj.getState() == 2) {		// if result of getState() equal 2 activated under line commands
					System.out.print("Enter your race: ");		// print out on console as "Enter your race: "
					race = keyboard.nextLine();		// get String type value into race
					obj.set_race(race);		// activated set_race in obj class and input is race
				}
			}
			catch(Exception e){		// if get Exception activated under line commands
				System.out.println(e.getMessage());		// print out the Exception message on console
				continue;		// continue the loop
			}
		}

	}

}
