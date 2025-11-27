package ders9EvTapsirigi;

public class Main {
	 public static void main(String[] args) {

	        Numbers nums = new Numbers(4, 9);
	        Calculator calc = new Calculator();

	        System.out.println("Toplama: " + calc.add(nums));
	        System.out.println("Çıxma: " + calc.subtract(nums));
	        System.out.println("Vurma: " + calc.multiply(nums));
	        System.out.println("Bölmə: " + calc.divide(nums));
	    }
}
