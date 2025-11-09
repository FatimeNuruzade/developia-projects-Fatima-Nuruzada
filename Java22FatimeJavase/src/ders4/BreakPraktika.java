package ders4;

public class BreakPraktika {
	public static void main(String[] args) {
		int a =20;
		for (int i = 2; i <= a/2; i++) {
			if(a%2==0) {
				System.out.println("sade deyil");
				break;
			}
		}
	}
}
