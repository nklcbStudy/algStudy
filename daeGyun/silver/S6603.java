import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int [] arr;
	static int [] ans =  new int [6];
	static boolean [] visit;
	
	public static void main(String[] args) throws IOException{
		 Scanner sc = new Scanner(System.in);

		while(true) {
			 N = sc.nextInt();
			
			if(N==0) {
				break;
			}else {
				 arr = new int [N];
				 for(int i = 0; i<N; i++) {
					 arr[i] = sc.nextInt();
				 }
				 visit = new boolean[N];
			}
			
			Arrays.sort(arr);
			doitdoit(0);
			System.out.println();
		}
	}
	
	public static void doitdoit(int idx) {
		if(idx == 6) {
			for(int i = 0; i<6; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<N; i++) {
			if(visit[i]) {
				continue;
			}
			if(idx>0 && ans[idx-1]>arr[i]) {
				continue;
			}
			ans[idx] = arr[i];
			visit[i] = true;
			doitdoit(idx+1);
			visit[i] = false;
		}
	}
}