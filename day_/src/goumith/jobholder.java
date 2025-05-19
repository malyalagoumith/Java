package goumith;
interface Intern{
	void internship();
	}
interface Developer extends Intern{
	void develope();
}
class employee1 implements Developer  {
	public void job1() {
		System.out.println("Half time employee");
	}
	public void internship() {
		System.out.println("i am an intern");
	}
	public void develope() {
		System.out.println("i am a developer ");
	}
}
class employee2 implements Developer  {
	public void job2() {
		System.out.println("Full time time employee");
	}
	public void internship() {
		System.out.println("i am an intern");
	}
	public void develope() {
		System.out.println("i am a developer ");
	}
}
public class jobholder{
public static void main(String[] args) {
	employee1 he=new employee1();
	employee2 fe=new employee2();
	he.job1();
	he.develope();
	he.internship();
	fe.job2();
	fe.develope();
	fe.internship();
}
}

