package day5;

class Dome{
	void sleep() {
		System.out.println("Dod is sleeping");
	}
}
class cat extends Dome{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class p2 {
	public static void main(String[] args) {
		cat d1=new cat();
		d1.sleep();
		d1.bark();
	}

}
