package day5;
class Fruits{
	void benifits() {
		System.out.println("Fruits  to eat");
	}
}
class Apple extends Fruits{
	void colour() {
		System.out.println("Red");
	}
}
class mango extends Fruits{
	void colour() {
		System.out.println("Red");
	}
}
class banana extends Fruits{
	void colour() {
		System.out.println("Red");
	}
}
public class p4 {
public static void main(String[] args) {
	Apple a1=new Apple();
	banana b1=new banana();
	mango m1=new mango();
	a1.benifits();
	a1.colour();
}
}
