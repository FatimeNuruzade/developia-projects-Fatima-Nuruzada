package ElaveDersArray;

public class Array5 {
	 public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 6, 6, 2, 2, 6, 4};

	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                System.out.println("Ardıcıl eyni ədəd: " + arr[i]);
	            }
	        }
	    }
}
