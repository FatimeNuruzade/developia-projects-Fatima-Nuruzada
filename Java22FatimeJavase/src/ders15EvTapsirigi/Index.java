package ders15EvTapsirigi;

import java.util.Scanner;

public class Index {
public static void main(String[] args) {
String[] students = {"Ali", "Veli", "Aysel"};

Scanner sc = new Scanner(System.in);
int index = sc.nextInt();

if (index < 0 || index >= students.length) {
    throw new ArrayIndexOutOfBoundsException("Yanlis");
}

System.out.println("secilmis adam: " + students[index]);
}

}
