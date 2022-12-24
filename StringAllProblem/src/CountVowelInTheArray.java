
public class CountVowelInTheArray {

	public static void main(String[] args) {
		String arr[]={"hareesh","asif","rajeuv","rakesh"};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			char  ch=arr[i].charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
