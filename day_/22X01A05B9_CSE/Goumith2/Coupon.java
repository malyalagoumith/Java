package Goumith2;

public class Coupon {
	public static void main(String[] args) {
		
		
		 try {
	            String couponCode = args[0];
	         
	            if (couponCode.equals("COUPON123")) {
	                System.out.println("Coupon code applied successfully");
	            } else {
	            	throw new Exception("Invalid coupon code");

	            }
	           

        } catch (Exception e) {
	          System.out.println("Failed to apply coupon: " + e.getMessage());
	        } finally {
	            System.out.println("Thank you for shopping with us!!");
	        }
	}
}