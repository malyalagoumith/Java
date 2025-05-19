package goumith;
interface Chef{
	void cook();
}
interface Waiter{
	void list();
}
interface Manager{
	void manag();
}
interface Hospitality{
	void furniter();
}
public class customer implements Chef,Waiter,Manager{
	public void dish() {
		System.out.println("The customer eat dish");
	}
}
public class hotal extends customer implements Hospitality {
	public void fivestar() {
		System.out.println("The hotal is fivestar");
	}
	public static void main(String[] args) {
		hotal h=new hotal();
		h.fivestar();
		h.cook();
		h.list();
		h.manag();
		h.furniter();
		h.dish();
		
	}
}
