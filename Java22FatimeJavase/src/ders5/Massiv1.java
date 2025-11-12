package ders5;

import java.util.Iterator;

public class Massiv1 {
public static void main(String[] args) {
	int numbers[]= {2,4,6,8,10};
	int cem =0;
			for (int i = 0; i < numbers.length; i++) {
				cem += numbers[i];
			}
	System.out.println("cem: "+cem);
}
}
