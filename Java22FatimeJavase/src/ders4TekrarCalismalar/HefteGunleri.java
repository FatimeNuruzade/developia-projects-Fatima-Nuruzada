package ders4TekrarCalismalar;

import java.util.Scanner;

public class HefteGunleri {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int hefteGunu=s.nextInt();
	switch(hefteGunu) {
	case 1:
		System.out.println("Bazar ertesi");
		break;
	case 2:
		System.out.println("Cersenbe axsami");
		break;
	case 3:
		System.out.println("Cersenbe");
		break;
	case 4:
		System.out.println("Cume Axsami");
		break;
	case 5:
		System.out.println("Cume");
		break;
	case 6:
		System.out.println("Senbe");
		break;
	case 7:
		System.out.println("Bazar");
		break;
	 default:
	        System.out.println("Gun");
	        break;
		
	}
}
}
