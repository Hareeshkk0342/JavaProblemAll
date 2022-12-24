
public class IndexNumberFound {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,4,78,9,7};
		boolean found =false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				System.out.println("the index of Array:-+"+i);
				found=true;
				break;
				
			}
		}
		if(!found) {
			System.out.println("the Elelment not Found");
		}
		

	}

}
