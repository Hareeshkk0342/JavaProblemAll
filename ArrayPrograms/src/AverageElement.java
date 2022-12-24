import java.util.Scanner;

public class AverageElement {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("the array list:-");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of the :-"+sum);
		int avg=sum/arr.length;
		System.out.println("the Array Element Average:-"+avg);

	}

}
