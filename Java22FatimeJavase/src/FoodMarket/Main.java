package FoodMarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Adiniz: ");
	String user = sc.next();
	
	System.out.println("Balansiniz: ");
	double balance = sc.nextInt();
	
	 ArrayList<Food> foodList = new ArrayList<>();
     foodList.add(new Food(1, "Pizza", 12.5));
     foodList.add(new Food(2, "Burger", 8.0));
     foodList.add(new Food(3, "Doner", 6.5));
     foodList.add(new Food(4, "Salat", 4.0));
     foodList.add(new Food(5, "Kartof Free", 3.5));
     foodList.add(new Food(6, "Sendviç", 5.0));
     foodList.add(new Food(7, "Pasta", 10.0));
     foodList.add(new Food(8, "Şorba", 4.5));
     foodList.add(new Food(9, "Kabab", 15.0));
     foodList.add(new Food(10, "Lahmacun", 2.5));

     ArrayList<Food> boughtFoods = new ArrayList<>();

     boolean continueBuying = true;
     while(continueBuying) {
    	 System.out.println("Yemekler");
         for (Food f : foodList) {
             System.out.println(f.id + ". " + f.foodName + " - " + f.price + " AZN");
     }
         System.out.print("Yemeyin ID-sini daxil edin: ");
         int selectedId = sc.nextInt();

         Food selectedFood = null;

         for (Food f : foodList) {
             if (f.id == selectedId) {
                 selectedFood = f;
                 break;
             }
         }

         if (selectedFood == null) {
             System.out.println("Yanlis ID daxil etdiniz!");
         } else {
             if (balance >= selectedFood.price) {
                 balance -= selectedFood.price;
                 boughtFoods.add(selectedFood);
                 System.out.println(selectedFood.foodName + " alındı.");
                 System.out.println("Qalan balans: " + balance + " AZN");
             } else {
                 System.out.println("Kifayet qeder balans yoxdur!");
             }
         }

}
}}
