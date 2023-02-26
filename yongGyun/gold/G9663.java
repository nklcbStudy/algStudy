import java.util.Scanner;

public class G9663 {
	
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] map;
	static boolean[] visit;
	static int ans;
//	n이 4라고 가정
//	{x, x, o, x}
//	{o, x, x, x}
//	{x, o, x, x}
//	{x, x, x, ?}
	//끝
	
	
	static void input() {
		n = sc.nextInt();
		map = new int[n + 1];
		visit = new boolean[n + 1];
	}
	
	static boolean canQueen(int y, int x) {
		if(x == 1) { // 체스판에 첫번째로 말을 두는 상황
			return true;
		}
		if(visit[y]) {
			return false;
		}
		//내가 이번 자리에 말을 놓았다고 가정하고 첫번째 칸에 있는 말부터 대각선인지 비교해준다.
		for(int i = 1; i < x; i++) {
			if(Math.abs(x - i) == Math.abs(y - map[i])) { // 이거는 한번 계산해보셈
				return false;
			}
		}
		
		return true;
	}
	
	static void checkNQueen(int cnt) {
		if(cnt == n + 1) { // 5 == 4 + 1
			ans++; // 답 + 1
			return; // 멈춰
		}
		
		for(int i = 1; i <= n; i++) {
			if(!canQueen(i, cnt)) {
				continue;
			}
			map[cnt] = i;
			visit[i] = true;
			checkNQueen(cnt + 1); // 1부터 시작해서 2 -> 3 -> 4 -> 5
			visit[i] = false; // 돌아온다 여기로
		}
	}
	
	public static void main(String[] args) {
		input();
		checkNQueen(1);
		System.out.println(ans);
	}
}
