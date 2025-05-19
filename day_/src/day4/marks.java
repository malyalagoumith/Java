package day4;

 class book {
String x;
int y;
int z;

//public marks() {
//	System.out.println("Welcome to my profile:Goumith");
public book(String x) {
	this.x=x;
	System.out.println(x);
}
public book(String x,int y) {
	this.x=x;
	this.y=y;
	System.out.println((x)+" "+(y));
}
public book(String x,int y,int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	System.out.println((x)+" "+(y)+" "+(z));
}
public class marks{
	public static void main(String[] args) {
//	marks m1=new marks();
	book m2=new book("java");
	book m3=new book("java",80);
	book m4=new book("java",80,72);
}
}
 }
