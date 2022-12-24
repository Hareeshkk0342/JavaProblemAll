import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int revrse=0;
	int temp=n;
	int r=0;
	 while(n!=0) {
      r=n%10;	
      revrse=(revrse*10)+r;
      n=n/10;
	 } 
	if(temp==revrse) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("IT is not palindrome");
	}

	}
	

}
