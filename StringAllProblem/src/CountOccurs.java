import java.util.Scanner;

public class CountOccurs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count =1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]){
                     count++;	
                     ch[j]=0;
					
				}
			}
			if(ch[i]!=0) {
				System.out.println(s.charAt(i)+"count is:-"+count);
			}
		}
		//Anothrer way to count occurs
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int arr[]=new int[120];
		for(int i=0;i<s.length();i++) {
			arr[(int)s.charAt(i)]++;
		}
		for(int i=0;i<120;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+"count is:-"+arr[i]+" ");
			}
		}*/

	}
}
