package Goumith2;
class BulkStockException extends Exception {
    public BulkStockException(String productName) {
        super("The " + productName + " cannot be ordered in quantities of more than 10 units.");
    }
}
class Buying {
    public void addToCart(String productName, int quantity) throws BulkStockException {
        if (quantity > 10) {
            throw new BulkStockException(productName);
        } else {
            System.out.println(quantity + " units of " + productName + " added to the cart.");
        }
    }
}


public class Buy {

	public static void main(String[] args) {
		 try {
	            String productName = args[0];
	            int quantity = Integer.parseInt(args[1]);

	            Buying cart= new Buying();
	            cart.addToCart(productName, quantity);

	        } catch (BulkStockException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Quantity must be a number.");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}