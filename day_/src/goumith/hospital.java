package goumith;
interface Doctor{
	void operation();
}
interface Nurse{
	void injuction();
}
class Componder{
	void fid() {
		System.out.println("First eid treatment");
	}
}
class patient extends Componder implements Doctor,Nurse{
	public void illness() {
		System.out.println("Patient is ill");
	}
	public void injuction() {
		System.out.println("nurse gives injuction");
	}
	public void operation() {
		System.out.println("Doctor do's operation");
	}
}
public class hospital extends patient{
	public void medical() {
		System.out.println("Hospital is medical purpose");
	}
	public static void main(String[] args) {
		hospital h1=new hospital();
		h1.medical();
		h1.operation();
		h1.injuction();
		h1.illness();
		h1.fid();
	}
}
