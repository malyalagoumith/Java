package day4;
abstract class shiva{
	static int a=10,b=20;
	abstract void add();
	abstract void sub();
	static void mul() 
	{
		a=30;
		b=40;
		System.out.println(a*b);
	}
	void div() 
	{
		a=10;
		b=20;
		System.out.println(a/b);
	}
	void mod()
	{
		a=10;
		b=20;
		System.out.println(a%b);
	}
}
class cal extends shiva{
	//a=10,b=20;
	public void add()
	{
	System.out.println(a+b);
}
	public void sub() 
	{
		System.out.println(a-b);
	}
}
public class cal1 {
public static void main(String[] args) {
	cal z=new cal();
	z.add();
	z.sub();
	cal.mul();
	z.div();
	z.mod();
}
}
