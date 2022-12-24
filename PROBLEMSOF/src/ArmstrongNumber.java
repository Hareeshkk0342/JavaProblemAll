import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int num=0;
		int temp=n;
		int sum=0;
		while(n>0) {
		num=n%10;
		n=n/10;
		sum=sum+num*num*num;
		
		}
		if(temp==sum) 
			System.out.println("it is an armstrong");
			
		
		else 
			System.out.println("it is not an armstrong");

	}

}
