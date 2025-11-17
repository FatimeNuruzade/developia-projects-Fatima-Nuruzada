package ders6EvTapsirigi;

public class Employee {
int id;
String name;
String surname;
int salary;

Employee(){
	System.out.println("Default");
}

Employee(String name){
	this.name=name;
	System.out.println(name);
}

Employee(String name,String surname){
	this.name=name;
	this.surname=surname;
	System.out.println(surname);
	System.out.println(name);
}

Employee(String name,int id,int salary){
	this.name=name;
	this.salary=salary;
	this.id=id;
	System.out.println(name);
	System.out.println(salary);
	System.out.println(id);
}
}
