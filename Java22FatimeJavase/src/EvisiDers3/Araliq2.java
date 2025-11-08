package EvisiDers3;

public class Araliq2 {
	 public static void main(String[] args) {
	        System.out.println("1-200 aralığında həm 3-ə, həm də 7-yə bölünən ədədlər:");

	        for (int i = 1; i <= 200; i++) {
	            if (i % 3 == 0 && i % 7 == 0) {
	                System.out.println(i);
	            }
	        }
	    }
}
