package ders5EvTapsirigi;

public class Massiv3 {
public static void main(String[] args) {
	int[] numbers = {1,2,3,4};
	int edediOrta =0;
	int cem =0;
	for (int i = 0; i < numbers.length; i++) {
		cem += numbers[i];
		edediOrta= cem/4;
	}
	System.out.println(edediOrta);
}
}
