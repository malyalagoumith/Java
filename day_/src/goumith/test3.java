package goumith;
interface  studeny1{
	void subject1();
}
class mentor1 implements studeny1{
	public void teach1() {
		System.out.println("mentor1 teaches student1");
	}
	public void subject1() {
		System.out.println(" student1 studies subject1");
	}
}
interface  studeny2{
	void subject2();
}
class mentor2 implements studeny2{
	public void teach2() {
		System.out.println("mentor1 teaches student1");
	}
	public void subject2() {
		System.out.println(" student1 studies subject1");
	}
}
interface  studeny3{
	void subject3();
}
class mentor3 implements studeny3{
	public void teach3() {
		System.out.println("mentor1 teaches student1");
	}
	public void subject3() {
		System.out.println(" student1 studies subject1");
	}
	public static void main(String[] args) {
		test1 t=new test1 ();
		t.subject1();
		t.subject2();
		t.subject3();
		t.teach1();
		t.teach2();
		t.teach3();
		
	}
}
