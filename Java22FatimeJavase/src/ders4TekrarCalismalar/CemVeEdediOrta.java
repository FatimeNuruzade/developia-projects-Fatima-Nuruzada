package ders4TekrarCalismalar;

import java.util.Scanner;

public class CemVeEdediOrta {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	int d = s.nextInt();
	int cem = a+b+c+d;
	System.out.println("Cem: "+cem);
	int edediorta = (a+b+c+d)/4;
	System.out.println("Ededi orta: "+edediorta);
			
}
}
