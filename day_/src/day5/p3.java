package day5;
class bike{
	void speed() {
		System.out.println("Speed");
	}
}
class gt extends bike{
	void silencer() {
		System.out.println("exost");
	}
}
class tyre extends gt{
	void aloy() {
		System.out.println("mrf");
	}
}
public class p3 {
	public static void main(String[] args) {
	tyre t=new tyre();
	t.speed();
	t.silencer();
	t.aloy();
}
}
