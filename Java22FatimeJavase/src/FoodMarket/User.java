package FoodMarket;

import java.util.ArrayList;

public class User {
    private String name;
    private double balance;
    private ArrayList<Food> boughtFoods = new ArrayList<>();

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean buyFood(Food food) {
        if (balance >= food.getPrice()) {
            balance -= food.getPrice();
            boughtFoods.add(food);
            System.out.println(food.getName() + " alındı");
            return true;
        } else {
            System.out.println("Kifayət qədər balans yoxdur");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Food> getBoughtFoods() {
        return boughtFoods;
    }
}
