package FoodMarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adınızı daxil edin: ");
        String name = sc.nextLine();

        System.out.print("Balansınızı daxil edin: ");
        double balance = sc.nextDouble();

        User user = new User(name, balance);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food(1, "Pizza", 8));
        foods.add(new Food(2, "Burger", 6));
        foods.add(new Food(3, "Doner", 5));
        foods.add(new Food(4, "Salat", 4));
        foods.add(new Food(5, "Kola", 2));
        foods.add(new Food(6, "Çay", 1));
        foods.add(new Food(7, "Kabab", 10));
        foods.add(new Food(8, "Şorba", 3));
        foods.add(new Food(9, "Pasta", 7));
        foods.add(new Food(10, "Chay", 3));

        boolean devam = true;

        while (devam) {
            System.out.println("MENYU");
            for (Food f : foods) {
                System.out.println(f);
            }

            System.out.print("Yeməyin ID-sini seçin: ");
            int id = sc.nextInt();

            Food selectedFood = null;
            for (Food f : foods) {
                if (f.getId() == id) {
                    selectedFood = f;
                    break;
                }
            }

            if (selectedFood != null) {
                user.buyFood(selectedFood);
            } else {
                System.out.println("Yanlış ID ❗");
            }

            System.out.print("Başqa yemək almaq istəyirsən? (bəli/xeyr): ");
            sc.nextLine();
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("xeyr")) {
                devam = false;
            }
        }
        System.out.println("ALIŞ MƏLUMATI");
        System.out.println("İstifadəçi: " + user.getName());
        System.out.println("Alınan yeməklər:");

        if (user.getBoughtFoods().isEmpty()) {
            System.out.println("Heç bir yemək alınmayıb");
        } else {
            for (Food f : user.getBoughtFoods()) {
                System.out.println("- " + f.getName());
            }
        }

        System.out.println("Qalan balans: " + user.getBalance() + " AZN");
    }
}

