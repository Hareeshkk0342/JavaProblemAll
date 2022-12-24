import java.util.LinkedHashSet;
import java.util.Set;

   public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,4,8};
		int arr1[]= {5,6,8,9,7};
		int a=arr.length;
		int b=arr1.length;
		int c=a+b;
		int c1[]=new int[c];
		for(int i=0;i<arr.length;i++) {
			c1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			c1[arr.length+i]=arr1[i];
		}
		System.out.println("the arrayList element:-");
		for(int i=0;i<c1.length;i++) {
			System.out.print(c1[i]+" ");
		}
	}
   }
		
	/*	String s="shivakumar";
		StringBuilder sb=new StringBuilder();
		Set<Character>set=new LinkedHashSet();
           for(int i=0; i<s.length()-1; i++) {
        	   set.add(s.charAt(i));
        	   
           }
           for(Character ch:set) {
        	   sb.append(ch);
           }
           System.out.println(sb);*/
		//
	
		
	


