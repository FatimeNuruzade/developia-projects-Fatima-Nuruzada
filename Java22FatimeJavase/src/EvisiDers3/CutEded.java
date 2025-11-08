package EvisiDers3;

import java.util.Scanner;

public class CutEded {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	if(a%2 ==0) {
		System.out.println("cut ededdir " +a);
	} else {
		System.out.println("cut deyil " +a);
	}
}
}
