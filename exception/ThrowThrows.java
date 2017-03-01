package com.full.exception;

public class ThrowThrows {
	
	static void number(String i) throws NullPointerException 
	{
		
		if(i.length()==10)
		System.out.println("user number :" +i);
		else
			throw new RuntimeException();
	}
	static void password(String password) throws InvalidPasswordException
	{
		if(password.length()!=4)
			throw new InvalidPasswordException();
		else
			System.out.println("valid password");
	}
	public static void main(String[] args) throws InvalidPasswordException {
	   	
		//System.out.println("enter your number");
		number("1234567890");
		password("madhuri");
		
	}

}
/*
public class TestThrow1{  
static void validate(int age){  
  if(age<18)  
   throw new ArithmeticException("not valid");  
  else  
   System.out.println("welcome to vote");  
}  
public static void main(String args[]){  
   validate(13);  
   System.out.println("rest of the code...");  
}  
}  
*/