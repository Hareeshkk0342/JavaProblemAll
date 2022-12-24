import java.util.Scanner;

public class PrimeNUmberorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is Prime Number");
		}
		else {
			System.out.println("it is Not Prime Number");
		}

	}

}
