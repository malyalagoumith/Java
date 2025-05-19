package day_2;

public class hai {
	// Java program to illustrate behavior with Wrapper Classe
	    public static void main(String[] args) {
	        Integer x1 = 10;
	        Integer x2 = 10;

	        if (x1 == x2) {
	            System.out.println("Same");
	        } else {
	            System.out.println("Not Same");
	        }

	        // For small values (cached by Java)
	        Integer y1 = 40;
	        Integer y2 = 40;

	        if (y1 == y2) {
	            System.out.println("Same");
	        } else {
	            System.out.println("Not Same");
	        }
	    }
	}


