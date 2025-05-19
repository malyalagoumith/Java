package goumith;
interface Dog{
	void eat();
}
interface Cat{
	void drink();
}
interface Pet extends Dog,Cat{
	public void sounds();
}
class cow {
	public void swallow() {
		System.out.println("the cow swallow the grass");
	}
}
public class Domastic extends cow implements Pet {
	public void road() {
		System.out.println("They wwalk on roads");
	}
	public void sounds() {
		System.out.println("The pets makes sounds");
	}
	public void eat() {
		System.out.println("Dog eat bone");
	}
    public void drink() {
	System.out.println("Cat drink milk");
}
    public static void main(String[] args) {
    	Domastic d=new Domastic();
    	d.eat();
    	d.drink();
    	d.sounds();
    	d.swallow();
    	d.road();
    }
}

