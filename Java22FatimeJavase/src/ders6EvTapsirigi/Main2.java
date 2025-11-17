package ders6EvTapsirigi;

public class Main2 {
public static void main(String[] args) {
	Employee first = new Employee();
	Employee second = new Employee("Maryam");
	Employee third = new Employee("Gunel","Hasanli");
	Employee fourth = new Employee("Nazim",20,1200);
	System.out.println("First Employee");
	System.out.println(first.name);
	System.out.println(first.id);
	System.out.println(first.salary);
	System.out.println(first.surname);
	
	System.out.println("Second Employee");
	System.out.println(second.name);
	System.out.println(second.id);
	System.out.println(second.salary);
	System.out.println(second.surname);
	
	System.out.println("Third Employee");
	System.out.println(third.name);
	System.out.println(third.id);
	System.out.println(third.salary);
	System.out.println(third.surname);
	

	System.out.println("Fourth Employee");
	System.out.println(fourth.name);
	System.out.println(fourth.id);
	System.out.println(fourth.salary);
	System.out.println(fourth.surname);
}
}
