package day6;
interface Hello{
	void show();
	void dead();
}
abstract class Chill implements Hello{
		public void dead() {
			System.out.println("Vanakkamm");
		}
	}
class AXION extends Chill{
	public void show() {
		System.out.println("namasthe");
	}
	public static void main(String[] args) {
	 AXION e=new AXION();
		e.dead();
		e.show();
	}
}


