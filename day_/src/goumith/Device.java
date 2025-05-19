package goumith;
interface Name{
	void cctv();
}
interface Status{
	void level();
}

class loction  {
	void place() {
		System.out.println("Device place");
	}
}
public class Device extends loction implements Name,Status {
	public void agent() {
		System.out.println("Smart agent");
	}
	public void level() {
		System.out.println("Smart agent level");
	}
	public void cctv() {
		System.out.println("Smart agent camara");
	}

	public static void main(String[] args) {
		Device d1=new Device();
		d1.cctv();
		d1.level();
		d1.place();
		d1.agent();
	}
}
