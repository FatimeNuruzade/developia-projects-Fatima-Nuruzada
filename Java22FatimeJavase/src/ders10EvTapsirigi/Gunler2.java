package ders10EvTapsirigi;

public class Gunler2 {
	enum WeekDays {
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
	    SUNDAY
	}
	    public static void main(String[] args) {
	        for (WeekDays day : WeekDays.values()) {
	            System.out.println(day);
	        }
	    }
	}

