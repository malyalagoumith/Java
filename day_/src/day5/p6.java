package day5;
class India{
	void Language() {
		System.out.println("Langueges I love");
	}
}
class Northindia extends India{
	void hindhi() {
		System.out.println("Mostly speaks hindhi");
	}
}
class Southindia extends India{
	void Tamil() {
		System.out.println("Mostly speak tamil");
	}
}
class Gujarat extends Northindia {
	void gujarathi() {
		System.out.println("Speaks gujarathi");
	}
}
class Maharastra extends Northindia{
	void marati() {
		System.out.println("speaks marati");
	}
}
class Telangana extends Southindia{
	void telangana() {
		System.out.println("speaks telangana");
	}
}
class Tamilnadu extends Southindia{
	void tamil() {
		System.out.println("Speaks tamil");
	}
}
public class p6 {
public static void main(String[] args) {
	Gujarat g1=new Gujarat();
	Maharastra m1=new Maharastra();
	Telangana t1=new Telangana();
	Tamilnadu n1=new Tamilnadu();
	g1.gujarathi();
	g1.hindhi();
	g1.Language();
}
}
