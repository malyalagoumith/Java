package day_3;

public class palindrome {
public static void main(String[] args) {
	int n=121;
	int sum=0,digit;
	while(n>0);{
		digit=n%10;
		sum=sum+digit;
		n=n/10;
	}
	if(sum==n){
		System.out.println("palindrome");
	}
		else {
			System.out.println("Not a palinrome");
		}
}
}
