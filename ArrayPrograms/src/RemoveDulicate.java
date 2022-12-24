
public class RemoveDulicate {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,3,2,1,4,5};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;i<arr.length;j++) {
			if(arr[j]==arr[i])
			{
				for(int k=j;k<arr.length;k++) {
					arr[k]=arr[k+1];
				}
				i--;
			}
			else {
				j++;
			}
		}
	
	
		for(int s=0;s<arr.length;s++) {
			System.out.println(arr[s]);
		}
	
	}

	}

}
