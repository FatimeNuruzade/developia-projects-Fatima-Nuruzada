package ElaveDersArray;

public class Array4 {
	public static void main(String[] args) {
        int[] arr = {1, 0, 4, 0, 21, 5}; 

        int count = 0;

        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Array-da 0-ların sayı: " + count);
        } else {
            System.out.println("Array-da 0 yoxdur");
        }
    }
}
