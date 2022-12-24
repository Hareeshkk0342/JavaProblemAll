import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		n=n+n1;
		n1=n-n1;
		n=n-n1;
		System.out.println(n+" "+n1);

	}

}
