package ders10EvTapsirigi;

import java.util.Scanner;

public class Gunler {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("reqem daxil et:  ");
	        int gun = sc.nextInt();

	        switch (gun) {
	            case 1:
	                System.out.println("Bazar ertesi");
	                break;
	            case 2:
	                System.out.println("Cersenbe axsami");
	                break;
	            case 3:
	                System.out.println("Cersenbe");
	                break;
	            case 4:
	                System.out.println("Cume axsami");
	                break;
	            case 5:
	                System.out.println("Cume");
	                break;
	            case 6:
	                System.out.println("Senbe");
	                break;
	            case 7:
	                System.out.println("Bazar");
	                break;
	            default:
	                System.out.println("Sehv");
	        }
	    }
}
