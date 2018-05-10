package edu.handong.csee.lab14.prob05;

public class MyException extends Exception{
	private String message = null;		// set the message as null
	 
    public MyException() {		// MyException class inherited all method in Exception
        super();
    }
 
    public MyException(String message) {		// if MyException class get input message value, inherited all method in Exception and input message value
        super(message);
        this.message = message;		// set the class variable message as input value message
    }
 
    public MyException(Throwable cause) {		// if MyException class throwable cause, inherited all method in Exception and input cause value
        super(cause);
    }
 
    public String toString() {		// this method define return the message
        return message;		// return the result of message
    }

}
