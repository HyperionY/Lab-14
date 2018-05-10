package edu.handong.csee.lab14.prob03;
import java.util.Scanner;		// import java library 'java.util.Scanner'

public class prob03 {

	public static final PowerCalc my_calculator = new PowerCalc();		// set the PowerCalc class as static and final
    public static final Scanner in = new Scanner(System.in);			// set the Scanner class as static and final

	public static void main(String[] args) {
		while (in.hasNextInt()) {		// get the int type value and loop until value is smaller than 0
            int n = in.nextInt();		// set int type local variable n and get int value
            int p = in.nextInt();		// set int type local variable p and get int value
            
            try {
                System.out.println(my_calculator.power(n, p));		// print out the result of power(n, p) on console
            } catch (Exception e) {		// if get Exception activated under line command
                System.out.println(e);		// print out the Exception on console
            }
        }


	}

}
