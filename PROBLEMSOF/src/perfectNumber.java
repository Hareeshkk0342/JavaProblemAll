import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<n) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum==n) {
			System.out.println("it is perfect Number");
		}
		else {
			System.out.println("it is not perfect Number");
		}

	}

}
