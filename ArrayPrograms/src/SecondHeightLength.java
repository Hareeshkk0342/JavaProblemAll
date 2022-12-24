import java.util.Scanner;

public class SecondHeightLength {

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
		
		int h=arr[0];
		int sec=arr[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(h<arr[i]) {
				h=arr[i];
			}
		if(sec>arr[i]&&sec<h) {
					sec=arr[i];
				}
			
			}
			System.out.println("the Secong height Element:-"+sec);
	}

}
