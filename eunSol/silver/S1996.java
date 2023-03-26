import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n; // 문서 개수
	static int m; // 찾을 문서 
	static int ans; // 몇 번째인지
	static Queue<Integer> q; // 문서 중요도
	static Queue<Integer> idx; // 문서 순서 인덱스

	static void print() {
		int cnt = 1; // 인쇄 횟수. 1부터 시작
		while (!q.isEmpty()) { // q가 다 빌 때까지
			int max = Collections.max(q); // 큐에서 제일 중요도가 큰 문서 찾기
			int cur = q.poll(); // 현재 맨 앞에 있는 문서
			int curIdx = idx.poll(); // 현재 맨 앞에 있는 문서의 인덱스
			if (cur == max) { // 뽑은 문서가 현재 큐에서 제일 중요도가 높으면 인쇄한다.
				if (curIdx == m) { // 그 문서가 우리가 찾는 문서라면
					ans = cnt; // 인쇄횟수를 답에 넣어준다.
				}
				cnt++; // 인쇄했다면 인쇄 카운트를 늘려준다.
			} else { // 뽑은 게 아직 인쇄할 때가 아니라면
				q.offer(cur); // 각자 배열 맨 뒤에 다시 넣어준다.
				idx.offer(curIdx);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			// 중요도 큐와 인덱스 큐를 나누어서 만들어준다.
			q = new LinkedList<>();
			idx = new LinkedList<>();
			// 각자 담아주기
			for (int i = 0; i < n; i++) {
				q.offer(sc.nextInt());
				idx.offer(i);
			}
			// 테케마다 답 초기화
			ans = 0;
			print();
			System.out.println(ans);
		}
	}
}