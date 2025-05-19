//import java.util.*;
//public class demo132 {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the values of a,b");
//		try {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}

//import java.util.*;
//public class demo132 {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the values of a,b");
//		try {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
//		}catch(ArithmeticException | InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
//		}
//	}
//
//
//import java.util.*;
//public class demo132 {
//	public static void main(String[] args) throws ArithmeticException  {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the values of a,b");
////		try {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
////		}catch(ArithmeticException  | InputMismatchException e) {
////			System.out.println(e.getMessage());
//		}
//		}

//
      




import java.util.*;
public class demo132 {
	public static void main(String[] args) throws ArithmeticException  {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of a,b");
//		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
//		}catch(ArithmeticException  | InputMismatchException e) {
//			System.out.println(e.getMessage());
		}
		}