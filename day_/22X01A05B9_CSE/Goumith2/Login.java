package Goumith2;

public class Login {
	
		static void exc(int a) {
			if(a<0||a>100) {
				throw new ArithmeticException("Invalid age");
			}
			else {
				System.out.println("Valid Age.");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int age=Integer.parseInt(args[0]);
			try {
			   exc(age);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		}

	}