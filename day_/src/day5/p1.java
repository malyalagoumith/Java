package day5;

class Animal{
	void sleep() {
		System.out.println("Dod is sleeping");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("Dog is barking")
	}
}
public class p1 {
	public static void main(String[] args) {
		dog d1=new dog();
		d1.sleep();
		d1.bark();
	}

}
