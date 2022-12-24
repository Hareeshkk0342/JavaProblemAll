import java.util.Scanner;

public class LeafYearorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int year=sc.nextInt();
		if(year%400==0) {
			System.out.println("it is  leafYear");
			
		}
		else if(year%100==0){
			System.out.println("it is not leafyear");
			
		}
		else  if(year%4==0){
			System.out.println("it is leafYear");
			
		}

	}

}
