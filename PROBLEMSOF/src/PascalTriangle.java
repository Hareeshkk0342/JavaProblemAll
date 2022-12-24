import java.util.Scanner;

public class PascalTriangle {
  public static int fact(int num) {
	  int fact=1;
	  int i=1;
	  if(num<i) {
		  fact=fact*1;
	  }
  
    return fact;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
		
		for(int j=0;j<=i;j++) {
			System.out.print(" "+fact(i)/fact(j)*fact(i-j));
		}
		System.out.println();
		}
	}

}
