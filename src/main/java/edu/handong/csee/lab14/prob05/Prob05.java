package edu.handong.csee.lab14.prob05;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		try{
	        Scanner keyboard = new Scanner(System.in);		// set the new Scanner as keyboard
	        String str = keyboard.nextLine();		// get the Stirng value and input the value into str
	        Prob05.myTest(str);		// activated myTest(str) in Prob05 class
	    }
		catch(MyException mae){		// if get MyException activated under line command
			System.out.println("Inside catch block: " + mae);		// print out on console as "Inside catch block: " and mae value
	    }
	}
	     
    static void myTest(String str) throws MyException{
        if(str.equals("null")){		// if str is null, activated under line command
            throw new MyException("String val is null");		// throw the MyException() and input the String "String val is null"
        }
        else		// if str is not null activated under line command
        System.out.println("String val is:" + str);		// print out on console as "String val is:" and value of str
	}

}
