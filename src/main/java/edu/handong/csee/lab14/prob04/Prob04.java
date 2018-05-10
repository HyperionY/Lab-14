package edu.handong.csee.lab14.prob04;
import java.util.Scanner;		// import java library 'java.util.Scanner'

public class Prob04 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		// set the Scanner as 'keyboard'
		int num = 0;		// set the int type local variable num as 0
		Boundary arr = new Boundary();		// set the Bondary() class as arr
		boolean repeat = true;		// set the boolean type variable repeat as true
		
		while(repeat) {		// loop until repeat value is false
			try {
				System.out.print("Enter an integer: ");		// print out on console as "Enter an integer: "
				num = keyboard.nextInt();		// get the int value to input
				arr.receive(num);		// activated receive() method in arr class
			}
			catch(ArrayIndexOutOfBoundsException e) {		// if get ArrayIndexOutOfBoundsException activated under line command
				System.out.println("Invalid array index access!");		// print out on console as "Invalid array index access!"
				repeat = false;		// set the repeat as false
			}
		}

	}

}
