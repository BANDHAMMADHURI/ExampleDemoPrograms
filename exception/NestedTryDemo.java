package com.full.exception;

public class NestedTryDemo {
public static void main(String[] args) {
	try
	{
		/*Object x = new Integer(0);
	     System.out.println("from outer try :"+(String)x);*/
		
		try
		{
			byte b=(Byte) null;
			
			System.out.println("from inner try : " +b);	
			
		}catch(Exception e)
		{
			System.out.println("Inner Exception :"+e);
		}
	}
	catch(Exception e)
	{
		System.out.println("outer Exception :" +e);
	}
	finally
	{
		System.out.println("have to execute");
	}
}
}
