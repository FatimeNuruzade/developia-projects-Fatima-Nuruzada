package ders10EvTapsirigi;

import java.util.Scanner;

public class Mail {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Email: ");
	        String email = sc.nextLine();

	        if (email.contains("@")) {
	            System.out.println("duzgun");
	        } else {
	            System.out.println("yanlis");
	        }
	    }
}
