import java.util.Scanner;

public class FirstCharacterString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0) 
				System.out.println(ch);
			
			else if(ch==' '){
				System.out.println(s.charAt(i+1));
			}
		}

	}

}
