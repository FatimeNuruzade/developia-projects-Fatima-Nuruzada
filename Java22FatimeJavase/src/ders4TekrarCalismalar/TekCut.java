package ders4TekrarCalismalar;

import java.util.Scanner;

public class TekCut {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	if(a%2 == 0) {
		System.out.println("cutdur");
	}else {
		System.out.println("tekdir");
	}
}
}
