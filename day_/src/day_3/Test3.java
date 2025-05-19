package day_3;

abstract class Test3 {
	abstract void add();
}
class Demo9 extends Test3{
	public void add() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Demo9 d1 = new Demo9();
		d1.add();
	}

}
