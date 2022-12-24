import java.util.Scanner;

public class TablesInALl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		for(int j=1;j<=50;j++) {
		for(int i=1;i<=10;i++) {
			System.out.println(j+"*"+  i+"="+(j*i)+" ");
		}
		}
       

	}

}
