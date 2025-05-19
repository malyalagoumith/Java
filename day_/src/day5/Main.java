package day5;

class Main {
String x;
int y;
int z;

//public marks() {
//	System.out.println("Welcome to my profile:Goumith");
public Main(String x) {
	this.x=x;
	System.out.println(x);
}
public Main(String x,int y) {
	this.x=x;
	this.y=y;
	System.out.println((x)+" "+(y));
}
public Main(String x,int y,int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	System.out.println((x)+" "+(y)+" "+(z));
}
public static void main(String[] args) {
//	marks m1=new marks();
	Main m2=new Main("java");
	Main m3=new Main("java",80);
	Main m4=new Main("java",80,72);
}
}
