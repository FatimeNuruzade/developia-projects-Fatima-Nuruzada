package Ders7EvTapsirigi;

import java.util.Scanner;

public class PrimitivDeyisenler {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b = sc.nextInt();
	int cem = a+b;
	System.out.println("Cemi: "+cem);
	int ferq = a-b;
	System.out.println("Ferqi: "+ferq);
	int hasil = a*b;
	System.out.println("Hasili: "+hasil);
	int qismet = a/b;
	System.out.println("Qismeti: "+qismet);
}
}
