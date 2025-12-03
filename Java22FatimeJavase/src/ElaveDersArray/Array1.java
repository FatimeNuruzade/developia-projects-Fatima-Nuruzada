package ElaveDersArray;

public class Array1 {
	public static void main(String[] args) {

        int[] arr = {11,54,23,76,98,43,22,35,76,16,25};

        int max = arr[0];

        int min = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;  
                max = num;
            }
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Ən böyük ədəd: " + max);
        System.out.println("Ən kiçik ədəd: " + min);
        System.out.println("İkinci ən böyük: " + secondMax);

        System.out.println(""
        		+ "3-ə bölünənlər:");
        for (int n : arr) {
            if (n % 3 == 0) System.out.print(n + " ");
        }

        System.out.println("5-ə bölünənlər:");
        for (int n : arr) {
            if (n % 5 == 0) System.out.print(n + " ");
        }

        System.out.println("7-yə bölünənlər:");
        for (int n : arr) {
            if (n % 7 == 0) System.out.print(n + " ");
        }
    }
}
