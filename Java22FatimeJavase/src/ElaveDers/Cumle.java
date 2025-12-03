package ElaveDers;

import java.util.Scanner;

public class Cumle {
public static void main(String[] args) {
	String a = "Biz bu gun magazaya getdik";
	System.out.println(a);
	int herfSayi = a.replace(" ", "").length();
	System.out.println("Herf sayi: "+ herfSayi);
	String[] sozler = a.split(" ");
	int say = sozler.length;
	System.out.println("Sozlerin sayi: "+say);
	String[] sozler2 = a.split(" ");

	System.out.println("herfi 5-den cox olan sozler: ");
	for (String s : sozler2) {
	    if (s.length() > 5) {
	        System.out.println(s);
	    }
	}

}
}
