package Ders7EvTapsirigi;

public class Massivler {
public static void main(String[] args) {
	int[] arr = {3,87,45,12,4};
	int max = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println(max);
}
}
