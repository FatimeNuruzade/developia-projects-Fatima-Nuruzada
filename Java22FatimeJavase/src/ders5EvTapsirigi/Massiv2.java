package ders5EvTapsirigi;

public class Massiv2 {
public static void main(String[] args) {
	int[] a = {1,2,5,9,10};
	int enBoyuk = a[0];
	int enKicik = a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]<enKicik) {
			enKicik = a[i];
		}
		if(a[i]>enBoyuk) {
			enBoyuk = a[i];
		}
	}
	System.out.println(enBoyuk);
	System.out.println(enKicik);
}

}
