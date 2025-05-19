package goumith;
interface shark{
	void sharp();
}
interface whale{
	void large();
}
interface Fish extends shark,whale{
	void eats();
}
public class test1  implements Fish{
	public void swim() {
		System.out.println("AQUATIC");
	}
	public void sharp() {
		System.out.println("SHARK IS SHARP");
		}
	public void large() {
		System.out.println("WHALE IS LARGE");
	}
	public void eats() {
		System.out.println("FISHES EATS");
		}
	public static void main(String[] args) {
		test1 t1=new test1 ();
		t1.sharp();
		t1.large();
		t1.eats();
		t1.swim();
	}
}
	