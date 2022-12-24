import java.util.Scanner;

public class CharacterSpecify {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if(ch1>='0'&&ch1<='9') {
				for(int j=0;j<(ch1-48);j++) {
					System.out.print(ch);
					
				}
				i++;
			}
			
				else {
					System.out.println(ch);
				}
			}
		System.out.println();
		
	}

}
