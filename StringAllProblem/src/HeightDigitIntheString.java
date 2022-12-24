import java.util.Scanner;

public class HeightDigitIntheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int n=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				int h=(int)(ch-48);
				if(h>n) {
					n=h;
				}
				
			}
		}
		System.out.println(n);

	}

}
