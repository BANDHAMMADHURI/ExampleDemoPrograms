package com.full.exception;

import static java.lang.System.out;

public class TryCatch {

	void math(int a, int b) {
		out.println("addition of " + a + "and " + b + " is :" + (a + b));
	}

	public static void main(String[] args) {
		TryCatch trycatch=new TryCatch();

		try
		{
			int a=5/0;
			trycatch.math(a,2);
		}
		catch(ArithmeticException e)
		{
			out.println(e);	
		}

	}
}