package ders6EvTapsirigi;

public class Calculator {


void calculateCircleLength(Circle cevre) {
    double result = 2 * Math.PI * cevre.radius;

    cevre.length = result;

    System.out.println("Length: " + result);
}
}
