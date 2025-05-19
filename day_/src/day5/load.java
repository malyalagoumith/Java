package day5;
class calcu{
	void show() {
		System.out.println("Going to calculate");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double p,double q) {
		System.out.println(p-q);
	}
	void show(String x,String y) {
		System.out.println(x.concat(y));
	}
}
public class load {
public static void main(String[] args) {
	calcu c=new calcu();
	c.show();
	c.show(1,2);
	c.show(3.0,4.3);
	c.show("shiva","vamshi");
}
}