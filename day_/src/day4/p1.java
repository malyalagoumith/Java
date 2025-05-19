package day4;
public class fixedamount {
	public int fixedamount=100000;
}
abstract class withdrawal{
	abstract void withdraw(int amount);
}
public class p1 exdends withdrawal{
	fixedamout f1 = new fixedamount();
	void withdraw(int amount) {
		f1.fixedamount-=amount;
		System.out.println("Withdraw"= amount);
		System.out.println("Avilable Balance:"+ f1.fixedamount);
	}
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		p1 d = new p1();
		d.withdraw(amount);
	}
}