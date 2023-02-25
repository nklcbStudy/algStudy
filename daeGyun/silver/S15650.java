import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static boolean[] visit;
	static int[] ans;
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visit = new boolean[N+1];
		ans = new int[M];
	}
	
	static void makeProg(int cnt) {
		//재귀 탈출조건
		if (cnt == M) {
			if(rise(ans)) {
				for(int i =0 ; i<M;i++) {
					System.out.print(ans[i] + " ");
				}
				System.out.println();
			}
			return;
		}
		
		//재귀반복
		for(int i = 1; i<=N;i++) {
			if(visit[i]) {
				continue;
			}
			ans[cnt] = i;
			visit[i] = true;
			makeProg(cnt+1);
			
			visit[i] =false;
		}
	}
	
	static boolean rise(int [] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		input();
		makeProg(0);
	}
}
