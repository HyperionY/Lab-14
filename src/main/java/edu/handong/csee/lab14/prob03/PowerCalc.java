package edu.handong.csee.lab14.prob03;

public class PowerCalc {
	 public long power(int n, int p) throws Exception
	    {
	        long result = 0;		// set the int type local variable 'result' as 0

	        result = (long)Math.pow(n, p);		// get result of 'n ^ p' into result variable
	        if(n < 0 || p < 0)		// if n smaller than 0 or p smaller than 0 activated under line command
	        {
	            throw new Exception("n or p should not be negative.");		// throw Exception and message
	        }
	        if(n == 0 && p == 0)		// if n and p equaled as 0 activated under line command 
	        {
	            throw new Exception("n and p should not be zero.");		// throw Exception and message
	        }
	        return result;		 // return value of result
	    }

}
