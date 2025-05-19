package day4;

public class tis {
int a;
int b;
public  tis(int x,int y){
	this.a=x;
	this.b=y;
	System.out.println(x+y);
}
public tis(tis t1) {
	this.a=t1.a;
	this.b=t1.b;
	System.out.println(a-b);
}
public static void main(String[] args) {
	tis t1=new tis(66,22);
	tis t2=new tis(t1);
}
}
