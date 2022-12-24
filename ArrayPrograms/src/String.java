import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class String {

	public static void main(java.lang.String[] args) {
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	java.lang.String s=sc.nextLine();
	System.out.println(s.charAt(0));
	System.out.println(s.charAt(s.length()-1));
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	for(int i=s.length();i>0;i--) {
		System.out.println(s.charAt(i));
	}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("it is vowel ");
			}
			else {
				System.out.println("it is not vowel");
			}
		}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		int al=0;
		int dg=0;
		int sy=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'){
				al++;
				
				
			}
			else if(ch>='0'&&ch<='9') {
				dg++;
				
			}
			else {
				sy++;
			}
		}
		System.out.println("the number of alphabets"+al);
		System.out.println("the nuber of digits"+dg);
		System.out.println("the nuber of Symbol"+sy);*/
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
	    java.lang.String s1="";
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	if(ch>='A'&&ch<='Z') {
	    		s1+=(char)(ch+32);
	    		
	    	}
	    	if(ch>='a'&&ch<='z') {
	    		s1+=(char)(ch-32);
	    	}
	    }
	    System.out.println(s1);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		boolean found=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o') {
				System.out.println("index found of:="+i);
				found =true;
				break;
			}
		}
		if(!found) {
			System.out.println("the character is not found");
		}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		 java.lang.String s1="";
		 for(int i=s.length()-1;i>=0;i--) {
			 s1+=s.charAt(i);
		 }
			 if(s.equals(s1)) {
				 System.out.println("it is palindrome");
			 }
			 else {
				 System.out.println("it is not palindrome");
			 }*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int c=1;
			for(int j=i+1;j<s.length();j++) {
		   if(ch[i]!='0') {
			   if(ch[i]==ch[j]) {
				   c++;
				   ch[j]=0;
			   }
		   }
			}
			if(ch[i]!='0') {
				System.out.println(s.charAt(i)+"is count is:-"+c);
		
			}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		int arr[]=new int[256];
		for(int i=0;i<s.length();i++) {
			arr[(int)s.charAt(i)]++;
		}
		 for(int i=0;i<256;i++) {
			 if(arr[i]!=0) {
				 System.out.println((char)i+"count is:-"+arr[i]);
			 }
		 }
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println("the number of words:-"+c);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		java.lang.String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int n=s.charAt(i+1)-48;
			for(int j=0;j<n;j++) {
				s1+=ch;
			}
			i++;
		}
		System.out.println(s1);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
				
			}
		}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		java.lang.String s1="";
		for(int i=0;i<s.length();i++) {
			int c=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
				c++;
			}
			}
		
		if(c==3) {
			s1=s1+s.charAt(i);
		}
			
		}
		System.out.println(s1);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		char ch[]=s.toCharArray();
		Set<Character>set=new HashSet<Character>();
		for(Character x:ch) {
			set.add(x);
		}
		for(Character y:set) {
			System.out.println(y);
		}*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		java.lang.String s1="";
		char ch=0;
		for(int i=0;i<s.length();i++) {
			if(ch!=s.charAt(i)) {
				s1=s1+s.charAt(i);
				ch=s.charAt(i);
			}
		}
		System.out.println(s1);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		java.lang.String s=sc.nextLine();
		char ch[]=s.toCharArray();
		char temp=ch[0];
		ch[0]=ch[1];
		ch[1]=temp;
		System.err.println(ch);
		
	
			
			
				
	}

}
