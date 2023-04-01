import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
	static int [ ] arr;
	static int [ ] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int [N];
		ans = new int[M];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		backing(0);
	}
	
	public static void backing(int ansIdx) {
		if (ansIdx == M) {
			for(int i = 0; i<M;i++) {
				System.out.print(ans[i]);
				if(i!=M-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<N;i++) {
			ans[ansIdx]=arr[i];
			if(ansIdx>0 && ans[ansIdx]< ans[ansIdx-1]) {
				continue;
			}
			backing(ansIdx+1);	
		}
		
	}
}