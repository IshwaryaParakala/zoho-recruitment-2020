import java.util.Scanner;

public class ZohoQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Value of n"+n);
		int min;
		for(int i =1 ;i <=n;i++) {
			for(int j=1;j<=n;j++) {
				min = i < j ? i : j;
				System.out.print(n-min+1+" ");
			}
			System.out.println();
		}
		sc.close();	

	}

}
