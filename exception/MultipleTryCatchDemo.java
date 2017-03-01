package com.full.exception;

public class MultipleTryCatchDemo {

	public static void main(String[] args) {
		String a = "10", c = "madhuri";
		short z[]=new short[5];
		try {
			short b = (short) Integer.parseInt(a);
			System.out.println(b);
			z[5]=b;
		}

		catch (NumberFormatException n) {
			System.out.println("number format exception : " + n);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception :" + ae);
		} catch (Exception e) {
			System.out.println("exception :" + e);
		}
		try {
			short sh = (short) Integer.parseInt(c);
			System.out.println("from try :" + sh);

		} catch (NumberFormatException n) {
			System.out.println("number format exception : " + n);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception :" + ae);
		} catch (Exception e) {
			System.out.println("exception :" + e);
		}
	}
}
