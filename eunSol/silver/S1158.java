import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사람 수
		int n = sc.nextInt();
		// 제거 순서
		int k = sc.nextInt();

		// 큐를 이용한다.
		Queue<Integer> q = new LinkedList<>();

		// 큐에 1부터 n까지 넣어준다.
		// 큐는 걍 offer, poll만 있다고 생각하기.
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		// 답을 합쳐줄 스트링빌더
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		// 큐가 하나 남기 전까지 실행
		while (q.size() != 1) {
			// 인덱스니까 k-1까지
			for (int i = 0; i < k - 1; i++) {
				// 큐에 뽑아낸 값을 다시 넣어준다.
				// 맨 뒤에 들어감
				q.offer(q.poll());
			}
			// 뽑아낸 값은 답에 넣어주고 제거
			sb.append(q.poll()).append(", ");
		}
		// while문 나오면 1개가 남음
		// 마지막 값을 답에 넣어주고 제거
		sb.append(q.poll()).append(">");
		System.out.println(sb);
	}
}
