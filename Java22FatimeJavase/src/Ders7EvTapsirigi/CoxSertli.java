package Ders7EvTapsirigi;

import java.util.Scanner;

public class CoxSertli {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if(x<0) {
		System.out.println("Menfi");
	} else if(x==0){
		System.out.println("sifir");
	}else if(x>0) {
		System.out.println("Musbet");
	}
	
}
}
