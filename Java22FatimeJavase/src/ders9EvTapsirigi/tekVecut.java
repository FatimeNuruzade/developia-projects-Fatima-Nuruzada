package ders9EvTapsirigi;

public class tekVecut {
public static void main(String[] args) {
	System.out.println("cut: ");
	for (int i = 1; i <=100; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	System.out.println("tek: ");
	for (int i = 1; i <=100; i++) {
		if(i%2 !=0) {
			System.out.println(i);
		}
	}
}
}
