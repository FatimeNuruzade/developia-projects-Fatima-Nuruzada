package ElaveDersArray;

public class Array3 {
	public static void main(String[] args) {

        int[] arr = {12, 45, 7, 33, 89, 21, 56, 90, 3, 17, 
                     8, 64, 22, 5, 39, 78, 11, 27, 99, 44};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double ortalama = sum / (double) arr.length;
        System.out.println("Array-in ortalaması: " + ortalama);

        System.out.println("Ortalamasından böyük ədədlər:");
        boolean varMi = false;
        for (int num : arr) {
            if (num > ortalama) {
                System.out.print(num + " ");
                varMi = true;
            }
        }

        if (!varMi) {
            System.out.println("Belə ədəd yoxdur.");
        }
    }
}
