package Ders7EvTapsirigi;

import java.util.Scanner;

public class Sertler {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if(age>18) {
		System.out.println("Yetkindir");
	}else {
		System.out.println("Yetkin deyil");
	}
}
}
