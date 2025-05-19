package goumith;


class superclass
{
	int a=100;
	public superclass()
	{
		
		System.out.println("the is the constructor of the class superclass");
	}
	void hi()
	{
		System.out.println("hi from super class");
	}
	
}
public class supr extends superclass{
	void show()
	{
		int y=10;
		System.out.println(y);
		System.out.println(super.a);
		super.hi();
		
		
	}
	public supr()
	{
		super();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		supr S=new supr();
		S.show();
		
	}

}