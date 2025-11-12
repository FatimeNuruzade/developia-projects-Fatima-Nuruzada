package ders5;

public class Massiv2 {
public static void main(String[] args) {
	int numbers[]= {1,2,3,4,5};
	int kicikEded=numbers[0];
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]<kicikEded) {
			kicikEded=numbers[i];
		}
		System.out.println(kicikEded);
	}
}
}
