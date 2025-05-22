package Goumith2;
import java.util.*; 
public class Hospital {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer as an string: ");
	        String input = sc.nextLine();

	        try {
	            int parsedInt = Integer.parseInt(input);
	            System.out.println("Parsed integer: " + parsedInt);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: The input is not a valid integer.");
	        }
	        sc.close();
		}

	}
