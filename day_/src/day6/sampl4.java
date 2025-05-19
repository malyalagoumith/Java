package day6;

public class sampl4 {
	void show() {
		System.out.println("hi");
	}
}
class simple{
	void print() {
		System.out.println("Hello");
	}
}
public static void main(String[] args) {
	sampl4 s1=new sampl4();
	s1.show();
	sampl4.simple s2=new sampl4().new simple();
}