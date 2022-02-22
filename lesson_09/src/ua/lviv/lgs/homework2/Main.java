/**
 * Copyright (c) 2022. All rights reserved.
 * LOGOS It Academy Home Work 2 for lesson 9
 * 
 * */

package ua.lviv.lgs.homework2;

/**
 * @since java 1.8
 * @version 1.1
 * @author oleksandr
 * */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IllegalAccessException {
		
		/**
		 * @param input parameters is int
		 * @exception IllegalArgumentException
		 * @exception ArithmeticException
		 * @exception IllegalAccessException
		 * @exception MyException
		 * */
		
		Methods m = new Methods();
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//realisation of exception methods
	    m.add(num1, num2);
	    m.subtract(num1, num2);
		m.multiply(num1, num2);
		m.devide(num1, num2);
		
	}

}
