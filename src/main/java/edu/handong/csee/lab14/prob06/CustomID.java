package edu.handong.csee.lab14.prob06;

public class CustomID extends Exception{

	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};	// set String type size of 3 array {"Vulcans", "Romulan", "Klingons"} as races. 
	private String name = "";		// set the String type variable name
	private int age = 0;		// set the int type variable age as 0
	private String race = "";		// set the Stirng type variable race
	private int state = 0;		// set the int type variable state as 0

	public void set_name(String str) throws Exception {		// this method get the Stirng value 'str' and throws Excemption
		if(str.length() < 5) {		// if str array size smaaller than 5 activated under line commands
			state = 0;		// set state as 0
			throw new Exception("Your name is short! Try again!");		// throw the Exception and message
		}
	
		else {		// if str array size larger than 5 activated under line commands
			this.name = str;		// input the str value to name class variable
			System.out.println("Name is valid");		// print out on console as "Name is valid"
			System.out.println("Name: " + this.name);		// print out the value of class variable name on console
			state++;		// increase 1 state value
		}
	}
	
	public void set_age(int num) throws Exception {		// this method get the int type value as num and throws Exception
		if(num < 18) {		// if num variable smaaller than 18 activated under line commands
			state = 1;		// set the state variable as 1
			throw new Exception("You are too young! Try again!");		// throw the Exception and message
		}
		else {		// if num variable larger than 18 activated under line commands
			this.age = num;		// input the num into class variable age
			System.out.println("Age is valid");		// print out on console as "Age is valid"
			System.out.println("Age: " + this.age);		// print out the class variable age on console
			state++;		// increase 1 state value
		}
	}
	
	public void set_race(String race) throws Exception {
		for(int i = 0; i < races.length; i++)
		{
			if(races[i].equals(race)) {
				this.race = races[i];
				System.out.println("Race is valid");
				System.out.println("Race: " + races[i]);
				state = 0;
				return;
			}
		}
		state = 2;
		throw new Exception("Human! Try again.");
	}
		
	public int getState() {
		return state;
	}

}
