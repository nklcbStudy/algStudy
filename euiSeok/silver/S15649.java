import java.util.Scanner;

public class Main {
	// 1부터 N까지의 자연수 중 중복없이 M개 고르기
	static int N;
	static int M;
	static boolean[] flag;
	static int[] sol;
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		sol = new int[M];
		
		flag = new boolean[N+1];
		
	}
	
	static void recursion(int idx) {
		
		if(idx == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(sol[i] + " ");
			}
			System.out.println(); 
			return; // 리턴이 없으면 재귀함수가 멈추지 않는다,,
		}
		
		for(int i = 1; i <= N; i++) {
			if(flag[i]) { // 이미 방문한 숫자는 또 방문할 필요가 없음
				continue; // 바로 다음 i를 본다.
			}
			sol[idx] = i; // 방문 안했으니 이제 방문해도 되겠네
			
			flag[i] = true; // 방문했다고 체크
			
			recursion(idx + 1);
			
			// 재귀가 끝나고 돌아온 시점에는 for문(i++)으로 넘어가면서 방문을 안하게 됨
			// ex) idx = 1이고 sol[idx] = 2일 경우, 다음 재귀함수를 호출하고 돌아왔기 때문에 다음에는 sol[idx] = 3이 되니까
			// 2는 방문하지 않은 것이 된다. 
			flag[i] = false;
		}
		
	}
	
	static void solve() {
		input();
		recursion(0);
	}
	
	public static void main(String[] args) {
		solve();
	}
}