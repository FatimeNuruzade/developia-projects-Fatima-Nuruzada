package ders15EvTapsirigi;

import java.util.Scanner;

public class Gift {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String gift = sc.next();
	if(gift==null) {
		  throw new NullPointerException("Gift dəyişəni null ola bilməz!");
	} else {
		System.out.println(gift.length());
	}
}
}
