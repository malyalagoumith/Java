package day_3;
abstract class calculator{
	int a=5,b=4;
	abstract void add();
	abstract void sub();
	static void mul()
	{
		int a=5,b=4;
		System.out.println(a*b);
	}
	void div()
	{
	int a=5,b=4;
	System.out.println(a/b);
	}
	void mod()
	{
		int a=5,b=4;
		System.out.println(a%b);
	}
}
class test4 extends  calculator{
	int a=5,b=4;
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}

public static void main(String[] args) {
	test4 a=new test4();
	a.add();
	a.sub();
	calculator.mul();
	a.div();
	a.mod();
}
}
