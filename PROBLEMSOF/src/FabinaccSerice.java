import java.util.Scanner;

public class FabinaccSerice {

	public static void main(String[] args) {
	int first=0;
	int second=1;
	int count=0;
	int result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	while(true) {
		result=first+second;
		count++;
		if(result>=n) {
			break;
		}
		first=second;
		second=result;
		System.out.println("The Fabinacco service:-["+count+"]=>"+result);
		
	}

	}

}
