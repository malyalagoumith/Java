package day_3;
abstract class shiva{
	int a=10,b=20;
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println(a*b);
	}
	void div() {
		System.out.println(a/b);
	}
	void mod() {
		System.out.println(a%b);
	}
}
class arth extends shiva{
	a=10,b=20;
	public void add() {
	System.out.println(a+b);
}
	public void sub() {
		System.out.println(a-b);
	}
public class arth {
public static void maain(String[] args) {
	arth z=new arth();
	z.add();
	z.sub();
	arth.mul();
	z.div();
	z.mod();
}
}
