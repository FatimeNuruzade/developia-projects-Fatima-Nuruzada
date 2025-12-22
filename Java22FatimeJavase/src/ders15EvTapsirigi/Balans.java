package ders15EvTapsirigi;

import java.util.Scanner;

public class Balans {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int balans = sc.nextInt();
	System.out.println("Balans: "+balans);
	
	if(balans>100) {
		 throw new IllegalArgumentException("Kifayet qeder balans yoxdur");
	}
			
}
}
