package edu.handong.csee.lab14.prob02;
import java.util.*;		// import all java library in 'java.util'

public class InputException {
	private int x = 0, y = 0;		// set the int type class variable 'x' and 'y' as 0

	public InputException(){	
	}
	
	public void error_det() {		// define to analyze the 'x / y'

	    try{
			Scanner keyboard = new Scanner(System.in);		// set the new Scanner(System.in) as Scanner type variable 'keyboard'
			System.out.print("x: ");		// print out on console as "x: "
			x = keyboard.nextInt();		// get the int value to input the x
			System.out.print("y: ");		// print out on console as "y: "
			y = keyboard.nextInt();		// get the int value to input the y
			System.out.println(this.x/this.y);		// pint out result 'x/y' on console
	    }
	    catch(ArithmeticException e){		// if get the ArithmeticException, activated under line command
	        System.out.println("java.lang.ArithmeticException: " + e.getMessage());		// print out on console as "java.lang.ArithmeticException: " and ArithmeticException message
	    }
	    catch(InputMismatchException e){		// if get the IputMismatchException, activateed under line command 
	        System.out.println("java.util.InputMismatchException");		// print out on console as "java.util.InputMismatchException"
	    }
	    catch(Exception e) {		// if get the Exception, activated under line command
	    	System.out.println("Some other exception has occurred: " + e.getMessage());		// print out on console as "Some other exception has occurred: " and Exception message
	    }
	}

}
