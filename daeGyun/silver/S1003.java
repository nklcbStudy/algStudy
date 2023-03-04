import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	static int n;
	static int [] cnt0= new int[41];
	static int [ ]cnt1= new int[41];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i =0; i<tc; i++) {

			n = sc.nextInt();
			
			count(n);
		}
		
	}
	
	private static void count(int item) {

		if (item==0) {
			System.out.print(1+" ");
			System.out.println(0);
		}else if(item==1) {
			System.out.print(0+" ");
			System.out.println(1);
		}else {
			cnt0[0]=1;
			cnt0[1]=0;
			
			cnt1[0]=0;
			cnt1[1]=1;
			
			for(int i = 2; i<=n;i++) {
				cnt0[i]=cnt0[i-2]+cnt0[i-1];
				cnt1[i]=cnt1[i-2]+cnt1[i-1];
			}
			System.out.print(cnt0[n]+" ");
			System.out.println(cnt1[n]);
		}
		
	}
		
}