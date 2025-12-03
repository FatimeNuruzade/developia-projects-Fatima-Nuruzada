package ElaveDers;

import java.util.Scanner;

public class Polidrom {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Söz daxil edin: ");
    String soz = sc.nextLine();
    String ters = "";
    for (int i = soz.length() - 1; i >= 0; i--) {
        ters += soz.charAt(i);
    }

    System.out.println("Tersi: " + ters);
<<<<<<< HEAD
=======
}
>>>>>>> 86f85ca06608339c54b8d987f07fc9a1071be809
}
}