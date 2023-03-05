import java.util.Scanner;

public class S15649 {
	
	static int n; // 1~n까지 나와야 됨
	static int m; // 한 수열에 총 몇개가 들어가나?
	static boolean[] visit; // 각 숫자마다 방문했는지 안했는지를 체크해주는 배열을 만들어줌 1번 인덱스가 true일 경우 또 방문하면 안됨
	static int[] ans; // 내가 현재 만든 수열에 무슨 값을 넣어줄지 1 2를 출력하기 위해서 ans[0] = 1; ans[1] = 2; 이런식으로 만듦
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 1~n까지 숫자로 해라
		m = sc.nextInt(); // m개만큼 수열을 만들어줘라
		visit = new boolean[n + 1]; // 1번 인덱스에서 1번 방문했는지를 체크하기 위해서 n+1 크기로 생성
		ans = new int[m]; // 수열 크기가 m이라고 문제에서 제시
	}
	
	static void makeProgression(int cnt) {
		
		// 1번은 재귀를 나갈 수 있는 조건 이걸 확실하게
		// 2번은 재귀를 왜 사용하는지?
		
		if(cnt == m) { // 뭐가 나올까요?
			for(int i = 0; i < m; i++) {
				System.out.print(ans[i] + " ");
			}
			System.out.println(); 
			return; // 리턴이 없으면 cnt가 무한대까지 올라간다 리턴없다고 가정해보시길
		}
		
		for(int i = 1; i <= n; i++) {
			if(visit[i]) { // 이미 방문한 숫자는 또 방문할 필요가 없음
				continue;
			}
			ans[cnt] = i; // 방문 안했으니 이제 방문해도 되겠네
			
			visit[i] = true; // 방문했다고 체크
			
			makeProgression(cnt + 1);
			
			// 재귀가 끝나고 돌아온 시점에는 for문(i++)으로 넘어가면서 방문을 안하게 됨
			// ex) cnt = 1이고 ans[cnt] = 2일 경우, 다음 재귀함수를 호출하고 돌아왔기 때문에 다음에는 ans[cnt] = 3이 되니까
			// 2는 방문하지 않은 것이 된다. 
			visit[i] = false;
		}
		
	}
	
	static void solve() {
		input();
		makeProgression(0);
	}
	
	public static void main(String[] args) {
		solve();
	}
}
