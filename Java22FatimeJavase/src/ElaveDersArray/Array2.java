package ElaveDersArray;

public class Array2 {
	public static void main(String[] args) {

        int[] arr = {22,45,32,76,89,54,21,36,73,25};

        int cutSay = 0;
        int tekSay = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                cutSay++;
            } else {
                tekSay++;
            }
        }

        System.out.println("Cüt ədədlərin sayı: " + cutSay);
        System.out.println("Tək ədədlərin sayı: " + tekSay);
    }
}
