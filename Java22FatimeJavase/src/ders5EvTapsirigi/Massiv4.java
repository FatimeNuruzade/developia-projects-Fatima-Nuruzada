package ders5EvTapsirigi;

public class Massiv4 {
public static void main(String[] args) {
	int[] a={1,3,4,8,12};
	
	for (int cut : a) {
		if(cut%2==0) {
			System.out.println("cut: "+cut);
		}
	}
	for (int tek : a) {
        if (tek % 2 != 0) {  
            System.out.print( "tek: "+tek );
        }
}
}
}