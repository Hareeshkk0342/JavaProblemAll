import java.util.Scanner;

public class SumOfArrayList {

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
		int arr1[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		sum+=sum+arr[i];
		arr[i]+=sum;
	}
	System.out.println("[");
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("]");

	}

}
