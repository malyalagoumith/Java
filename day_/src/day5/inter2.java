package day5;
interface I2{
	void add();
}
interface I3{
	void sub();
}
public class inter2 implements I2,I3{
	public void add() {
		System.out.println("namasthe");
	}public void sub() {
		System.out.println("namasthe");
	}public void main(String[] args) {
	inter2 i2=new inter2();
	i2.add();
	i2.sub();
}
}
//}
//     class to interface and inter face to interface



