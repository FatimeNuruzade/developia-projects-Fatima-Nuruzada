package ders6EvTapsirigi;

public class Main4 {
	 public static void main(String[] args) {

	        Circle c = new Circle();
	        c.radius = 7.3;

	        Calculator calculator = new Calculator();
	        calculator.calculateCircleLength(c);

	        System.out.println("Circle length: " + c.length);
	    }
}
