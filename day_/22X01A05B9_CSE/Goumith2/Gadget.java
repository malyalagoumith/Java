
package Goumith2;


class GadgetFailureException extends Exception {
    public GadgetFailureException(String message) {
        super(message);
    }
}


public class Gadget {
    public static void main(String[] args) {
        try {
           
            if (args.length == 0) {
                throw new IllegalArgumentException("No device name provided");
            }
            String c = args[0];
            if (c.equals("printer1") || c.equals("printer3")) {
                System.out.println("Available");
            } else {
                throw new GadgetFailureException("Not Available");
            }
        } catch (GadgetFailureException e) {
            System.out.println("Device failure: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}