package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double priceForKm = 0.21;
		System.out.println("How many kilometers do you have to travel: ");
		int kmToDo = sc.nextInt();

		System.out.println("How old are you? ");
		int userYears = sc.nextInt();
		double price = kmToDo * priceForKm;
		
		if(userYears < 18) {
			
			price = price - (price * 0.2);
		}else if(userYears > 65) {
			
			price = price - (price * 0.4);
		}
		
		System.out.println(price);
		sc.close();
		
	}
}
