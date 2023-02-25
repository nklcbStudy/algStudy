import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int [] arr;
	static boolean[] visit;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int [N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		visit = new boolean[N+1];
		ans = new int[M];
	}
	
	static void makeProg(int cnt) {
		//재귀 탈출조건
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				  sb.append(ans[i]+ " ");
				}
			sb.append("\n");
			return;
		}
		
		//재귀반복
		for(int i = 0; i<N;i++) {
			if(visit[i]) {
				continue;
			}
			ans[cnt] = arr[i];
			visit[i] = true;
			makeProg(cnt+1);
			
			visit[i] =false;
		}
	}
	
	
	public static void main(String[] args) {
		input();
		makeProg(0);
		System.out.println(sb);
	}
}