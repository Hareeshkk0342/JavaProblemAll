
public class FirstCharacterisVowel {

	public static void main(String[] args) {
		String arr[]= {"hareesh","rajesh","asif","baburao"};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i].charAt(0);
			if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') {
				c++;
			}
		}
		System.out.println(c);
		

	}

}
