package day6;
public class sampl3 extends Object{
		int a=10;
		void add() {
			int a=89;
			System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
}
//package day6;
//
//public class sampl3{
//	final void show() {
//		System.out.println("hi");
//	}
//	publ
//	public static void main(String[] args) {
//		sampl3 s1=new sampl3();
//		s1.show();
//	}
//}