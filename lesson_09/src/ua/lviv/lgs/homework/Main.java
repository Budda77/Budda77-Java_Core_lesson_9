/**
 * Copyright (c) 2022. All rights reserved.
 * LOGOS It Academy Home Work for lesson 9
 * 
 * */


package ua.lviv.lgs.homework;

/**
 * @since java 1.8
 * @version 1.1
 * @author oleksandr
 * */

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Press 1 to check if month is available");
		System.out.println("Press 2 to show all months of season");
		System.out.println("Press 3 to show all months with the same number of days");
		System.out.println("Press 4 to show all months with more days");
		System.out.println("Press 5 to show all months with less days");
		System.out.println("Press 6 to show next season");
		System.out.println("Press 7 to show previous season");
		System.out.println("Press 8 to show month with pair number of days");
		System.out.println("Press 9 to show month with odd number of days");
		System.out.println("Press 10 to show entered month with pair number of days");
	}
	
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		
		/**
		 * @param input parameters is String and int
		 * @exception WrongInputConsoleParametersException
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		String message = "The input data is wrong. Please, enter correct data.";
		
		/* implementation of ENUM array */
		Month [] mon = Month.values();
		
		menu();
		
		int inputNumber = scanner.nextInt();
		
		/* This is main method with ENUM algorithm*/
		switch(inputNumber) {

			case 1:{
				System.out.println("Please, enter month: ");
				
				boolean flag = false;
				
				String month = inputMonth(); 
				
				/* data checking implementation method in ENUME*/
				flag = arrayOfMonth(mon, month);

					if(!flag) {
						throw new WrongInputConsoleParametersException(message); 
					}
				break;
			}
			
			case 2: {
				System.out.println("Please, enter season: ");
				
				boolean flag = false;
				
				String month = inputMonth(); 
				
				 for(Month m: mon) {
					
					 if(m.getSeason().name().equals(month)) {
						
						System.out.println("The season " + m.getSeason() + " include " + m);	
						flag = true;
					} 
				}	
					if(!flag) {
						
						throw new WrongInputConsoleParametersException(message); 
					}
				break;
			}
			
			case 3: {
				System.out.println("Please, enter number of days the months have: ");
				
				int numberOfDays = inputNumberOfDays();
				
				boolean flag = false;
				
				for(Month m: mon) {
					
					if(m.getNumOfDays() == numberOfDays) {
	
						flag = true;
					}
				}	
				if(!flag) {

					throw new WrongInputConsoleParametersException(message); 
				}
				break;
			}
			
			case 4: {
				System.out.println("Please, enter number of days: ");
				
				int numberOfDays = inputNumberOfDays();
				
				boolean flag = false;
				
				for(Month m: mon) {
					
					if(m.getNumOfDays() > numberOfDays) {
						
						System.out.println("The following month: " + m.name() + " have more days then " + numberOfDays);
						flag = true;						
					} 
				}
				if(!flag) {
					
					throw new WrongInputConsoleParametersException(message); 
					
				}				
				break;
			}
			
			case 5: {
				System.out.println("Please, enter number of days: ");

				int numberOfDays = inputNumberOfDays();

				boolean flag = false;

				for(Month m: mon) {
					if(m.getNumOfDays() < numberOfDays && 31 >= numberOfDays) {
						System.out.println("The following month: " + m.name() + " " + m.numOfDays+ " have less days then " + numberOfDays);
						flag = true;
					} 
				}	
				if(!flag) {

					throw new WrongInputConsoleParametersException(message);

				}	
				break;
			}
			
			case 6:{
				System.out.println("Please, enter season: ");
				
				String month = inputMonth(); 
				
				boolean flag = monthExist(mon, month);

				 if(flag) {
					 
					 Seasons season = Seasons.valueOf(month);
					 Seasons [] s = Seasons.values();
					 
					 int ordinal = season.ordinal();
					 
					 if(ordinal == s.length-1) {
						 ordinal = 0;
						 
						 System.out.println("The next season is " + s[ordinal]); 
						 
					 }else {
						 
						 System.out.println("The next season is " + s[ordinal + 1]); 
					 }	
				 }		
					if(!flag) {
						
						throw new WrongInputConsoleParametersException(message);
					}
					
				break;
			}
			
			case 7:{
				System.out.println("Please, enter season: ");
				
				String seasonData = inputMonth(); 
				
				boolean flag = monthExist(mon, seasonData);

				 if(flag) {		 
					 Seasons season = Seasons.valueOf(seasonData);
					 Seasons [] s = Seasons.values();
					 
					 int ordinal = season.ordinal();
					 
					 if(ordinal == 0) {
						 
						 ordinal = s.length-1;
						 
						 System.out.println("The previous season is " + s[ordinal]); 
						 
					 }else {
						 
						 System.out.println("The previous season is " + s[ordinal - 1]); 
					 }	
				 }
					if(!flag) {
						
						throw new WrongInputConsoleParametersException(message);
						
					}
				break;
			}
			
			case 8: {
				System.out.println("The following months have pair number of days: ");
	
				for(Month m: mon) {
					
					if(m.getNumOfDays() % 2 == 0) {
						
						System.out.println( m.name() + " " + m.numOfDays);				
					} 
				}					
				break;
			}
			case 9: {
				System.out.println("The following months have odd number of days: ");
	
				for(Month m: mon) {
					
					if(m.getNumOfDays() % 2 > 0) {
						
						System.out.println( m.name() + " " + m.numOfDays);				
					} 
				}					
				break;
			}
			case 10: {
				
				System.out.println("Input month: ");
				
				boolean flag = false;
				
				String month = inputMonth();
	
				for(Month m: mon) {
										
					if(m.name().equals(month)) {
						
						if(m.getNumOfDays() % 2 == 0) {
							
							System.out.println("The following months have pair number of days: " + m.name() + " " + m.numOfDays);
							flag = true;
							
						} else {
							
							System.out.println("The following months have odd number of days: " + m.name() + " " + m.numOfDays);
							flag = true;
						}						
					}					
				}	if(!flag) {
					
					throw new WrongInputConsoleParametersException(message);
					
				}				
				break;
			}

		}
	
	}
		

	private static String inputMonth() {
		
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		return month;
	}
	
	private static int inputNumberOfDays() {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	private static boolean arrayOfMonth(Month [] mon, String data) {
		boolean flag = false;
		
		for(Month m: mon) {
			if(m.name().equals(data)) {
				System.out.println("There is the following month: " + m);
				flag = true;
			} 
		}
		return flag;		
	}
	
	private static boolean monthExist(Month [] mon, String data) {
		boolean flag = false;
		
		for(Month m: mon) {
			if(m.getSeason().name().equals(data)) {	
				flag = true;
			}
		}
		return flag;		
	}
}
