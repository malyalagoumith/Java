
        //normal output of exception
//package day6;
//public class ex{
//	public static void main(String[] args) {
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		System.out.println("hello");
//		try {
//		int c=a/b;
//		System.out.println(c);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//}
//}
//
//

         //printStackTrace in red 
//package day6;
//
//public class ex {
//	public static void main(String[] args) {
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		System.out.println("hi");
//		try {
//		int c=a/b;
//	    System.out.println(c);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
//		
//
//		System.out.println("hi");
//	}
//
//}

          //toString as normal error output

//package day6;
//
//public class ex {
//	public static void main(String[] args) {
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		System.out.println("hi");
//		try {
//		int c=a/b;
//	    System.out.println(c);
//		}
//		catch(Exception e) {
//			System.out.println(e.toString());
//		}
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
//		
//		
//		
//		
//		System.out.println("hi");
//	}
//
//}
       //it only prints the issue like / By zero

//package day6;
//
//public class ex {
//	public static void main(String[] args) {
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		System.out.println("hi");
//		try {
//		int c=a/b;
//	    System.out.println(c);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
//		
//		
//		
//		
//		System.out.println("hi");
//	}
//
//}

package day6;
interface Hello{
	void show();
}
abstract class ex implements Hello{
	void print() {
		System.out.println("I am printing");
	}
	public static void main(String[] args) {
		ex e=new ex();
		e.print();
	}
}





































