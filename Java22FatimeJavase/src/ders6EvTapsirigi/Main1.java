package ders6EvTapsirigi;

public class Main1 {
public static void main(String[] args) {
	Person first = new Person();
	Person second = new Person();
	first.age=20;
	first.id=95;
	first.name="Ali";
	first.surname="Aliyev";
	first.phone=055555555;
	
	second.age=25;
	second.id=22;
	second.name="Anar";
	second.surname="Abbasli";
	second.phone=055534;
	
	System.out.println("First Person: ");
	System.out.println(first.age);
	System.out.println(first.id);
	System.out.println(first.name);
	System.out.println(first.surname);
	System.out.println(first.phone);
	
	System.out.println("Second Person: ");
	System.out.println(second.age);
	System.out.println(second.id);
	System.out.println(second.name);
	System.out.println(second.surname);
	System.out.println(second.phone);
}
}
