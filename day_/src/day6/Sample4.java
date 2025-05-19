//package day6;
//
//public class Sample4 {
//	void show() {
//		System.out.println("hi");
//	}
//class Vimple{
//	void print() {
//		System.out.println("Hello");
//	}
//}
//public static void main(String[] args) {
//	Sample4 s1=new Sample4();
//	s1.show();
//	Sample4.Vimple s2=new Sample4().new Vimple();
//	s2.print();
//}
//}


//package day6;
//public class Sample4{
//	void shiva() {
//		System.out.println("Shiva loves bhumika");
//		class Single {
//			void Bhumi() {
//				System.out.println("But");
//			}
//		}
//		Single s=new Single();
//		s.Bhumi();
//}
//	public static void main(String[] args) {
//		Sample4 s1=new Sample4();
//		s1.shiva();
//	}
//}


package day6;
class Sorry{
	private static void show() {
		System.out.println("Show kotodhuu");
	}
	static class Shiva {
		static void print() {
			System.out.println("Only print");
			show();
			}
	}
}
public class Sample4{
	public static void main(String[] args) {
		Sample4.Shiva.print();
	}
}