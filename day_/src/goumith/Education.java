package goumith;
interface Student{
	void marks();
}
class teacher{
	public void subject() {
		System.out.println("English");
	}
}
class Class extends teacher implements Student{
	public void room() {
		System.out.println("class room");
	}
	public void marks() {
		System.out.println("I got 50 marks");
	}
}
public class Education extends Class{
	public void school() {
		System.out.println("NRCM");
	}
	public static void main(String[] args) {
		Education e1=new Education();
		e1.school();
		e1.marks();
		e1.room();
		e1.subject();
	}
}

