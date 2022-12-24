import java.util.Scanner;

public class CountDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			int c=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
			
		
		if(s.charAt(i)!=0) {
			System.out.println(s.charAt(i)+"count is:-"+c);
		}
		}
	}
		}
	}
}
