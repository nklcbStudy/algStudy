import java.io.IOException;  
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] arr  = new long[N+1];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i<=N; i++) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		
		
		long ans = (arr[N]+arr[N-1])*2;
		System.out.println(ans);
	}
	
}