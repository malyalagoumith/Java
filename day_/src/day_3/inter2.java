package day5;
interface I1{
	void add() {
		System.out.println("namasthe");
	}
}
interface I2{
	void sub() {
		System.out.println("vanakkam");
	}
}
public class inter2 implements I1,I2{
public static void main(String[] args) {
	inter2 i2=new inter2();
	i2.add();
	i2.sub();
}
//}
//     class to interface and inter face to interface



