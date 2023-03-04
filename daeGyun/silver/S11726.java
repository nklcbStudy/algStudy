import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	static long [] box= new long[1001];
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		count(n);
		
	}
	
	private static void count(int item) {

		if (item==1) {
			System.out.print(1);

		}else if(item==2) {
			System.out.print(2);

		}else {
			box[1]=1;
			box[2]=2;
			
			for(int i = 3; i<=n;i++) {
				
				box[i]=box[i-2]+box[i-1];
				if(box[i]>=10007) {
					box[i]=box[i]%10007;
				}
//				System.out.print(i+" ");
//				System.out.print(box[i]+" ");
//				System.out.println(box[i]%10007);
			}
			System.out.println(box[n]);
//			System.out.println(box[n]%10007);
		}
		
	}
		
}