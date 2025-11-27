package ders9EvTapsirigi;

public class Calculator {
	  public int add(Numbers nums) {
	        return nums.a + nums.b;
	    }
	    public int subtract(Numbers nums) {
	        return nums.a - nums.b;
	    }
	    public int multiply(Numbers nums) {
	        return nums.a * nums.b;
	    }
	    public double divide(Numbers nums) {
	        if (nums.b == 0) {
	            System.out.println("0-a olmur");
	            return 0;
	        }
	        return (double) nums.a / nums.b;
	    }
}
