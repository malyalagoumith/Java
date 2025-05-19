package day_3;

public class pal{
public static void main(String[] args) {
	int n=121;
	int sum=0,digit;
	int hi=n;
	while(hi>0){
		digit=hi%10;
		sum=sum*10+digit;
		hi=hi/10;
	}
	if(sum==n){
		System.out.println("palindrome");
	}
	else {
			System.out.println("Not a palinrome");
	}
}
}
