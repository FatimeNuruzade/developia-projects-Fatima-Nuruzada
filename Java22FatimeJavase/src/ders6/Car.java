package ders6;

public class Car {
String brand;
String model;
int maxSpeed;
int currentSpeed;

public void start() {
	currentSpeed=10;
	System.out.println("car started");
}
public void stop() {
	currentSpeed=0;
	System.out.println("car stopped");
}
}
