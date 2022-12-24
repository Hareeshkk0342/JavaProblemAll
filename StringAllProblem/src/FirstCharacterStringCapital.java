import java.util.Scanner;

public class FirstCharacterStringCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				s1=s1+(char)(s.charAt(i)-32);
			}
			else if(i>0) {
				if(s.charAt(i-1)==' ') {
					s1=s1+(char)(s.charAt(i)-32);
				}
				else {
					s1=s1+s.charAt(i);
				}
			}
		}
		System.out.println(s1);
	}

}
