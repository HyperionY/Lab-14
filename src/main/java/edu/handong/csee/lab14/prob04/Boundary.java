package edu.handong.csee.lab14.prob04;

public class Boundary {
	private static int [] arr = new int[5];		// set the size of 5 int type array as 'arr'
	private static int cnt = 0;		// set the int type variable 'cnt' as 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException		// this method throws ArrayIndexOutOfBoundsException
	{
		int i = cnt;		// set int type local variable i and input the class variable cnt
		arr[i] = num;		// get the input num value and input to arr[i] 
		cnt++;		// Increase 1 to the cnt variable
		System.out.printf("arr[%d] <- %d\n", i, num);		// print out on console in "" strings
	}

}
