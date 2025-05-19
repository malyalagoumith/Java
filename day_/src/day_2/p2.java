package day_2;

public class p2 {
public static void main(String[] args) {
	int a=20;
	int h[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	for(int i=1;i<=a;i++) {
		if((i%1==0) && (i%i==0)){
			System.out.println(i);
		}
	}
}	
}
