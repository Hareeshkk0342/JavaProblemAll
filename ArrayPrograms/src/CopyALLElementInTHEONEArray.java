
public class CopyALLElementInTHEONEArray {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,56,80,7,};
	int x=0;
	int arr1[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i];
		x++;
	}
     int y[]=new int[x];
		int z=0;
		 for(int i=0;i<arr.length;i++) {
		   y[z]=arr[i];
		   z++;
	   }
	
	for(int i=0;i<y.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	
	}

}
