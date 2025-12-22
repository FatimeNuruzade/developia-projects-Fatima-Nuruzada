package ders15EvTapsirigi;

import java.util.Scanner;

public class Yas {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        if (a < 18) {
	            throw new RuntimeException("Baxmaq olmaz");
	        }

	        System.out.println("Baxmaq olar");
	    }
}
