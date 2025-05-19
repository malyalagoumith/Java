package day5;
class movie {
	void moto() {
		System.out.println("police");
	}
}
class Singam extends movie{
	void villan() {
		System.out.println("Prakashraj");
	}
}
class Singam2 extends Singam{
	void hero() {
		System.out.println("Surya");
	}
}
class Singam3 extends Singam{
	void heroin() {
		System.out.println("Anushka");
	}
}
public class p5 {
public static void main(String[] args) {
	Singam2 s2=new Singam2();
	Singam3 s3=new Singam3();
	s3.heroin();
	s3.villan();
	s3.moto();
	s2.hero();
	s2.villan();
	s2.moto();
}
}
