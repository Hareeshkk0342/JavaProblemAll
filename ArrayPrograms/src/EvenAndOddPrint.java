
public class EvenAndOddPrint {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				a++;
			}
			else {
				b++;
			}
		}
		int arr1[]=new int[a];
		int arr2[]=new int[b];
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					arr1[x]=arr[i];
					x++;
					
				}
				if(arr[i]%2!=0) {
					arr2[y]=arr[i];
					y++;
					
				}
				}
	System.out.println("the Even Element:-");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
  System.out.println("the Odd Element:-");
  for(int i=0;i<arr2.length;i++) {
	  System.out.print(arr2[i]+" ");
  }
  

	}

}
