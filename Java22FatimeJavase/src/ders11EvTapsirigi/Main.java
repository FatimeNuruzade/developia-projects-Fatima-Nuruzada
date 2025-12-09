package ders11EvTapsirigi;

public class Main {
public static void main(String[] args) {
	String s1 = "Ali";
	System.out.println(s1);
	String message ="Java dilini öyrənmək maraqlı və faydalıdır";
	System.out.println(message);
	System.out.println("simvol sayi: "+message.length());
	System.out.println("indeks(n): " +  message.charAt(9));
	System.out.println("kicik: "+ message.toLowerCase());
	System.out.println("boyuk: "+ message.toUpperCase());
	System.out.println("cumlede Jav var? "+ message.contains("Jav"));
	System.out.println("cumle faydalıdır ile bitir: " + message.endsWith("faydalıdır"));
	System.out.println("Java ile baslayir: "+ message.startsWith("Java"));
}
}
