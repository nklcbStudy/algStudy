package silver;

import java.util.Scanner;

public class S15651 {

	static StringBuilder sb = new StringBuilder();
	// 속도를 개선하기 위해 StringBuilder 사용
	static int n;
	static int m;
	static int[] arr;

	static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m]; // 숫자 쌓기
	}

	static void makeProgression(int cnt) { // cnt는 출력시 위치를 나타냄

		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {

			arr[cnt] = i;

			makeProgression(cnt + 1);

		}

	}

	static void solve() {

		input();
		makeProgression(0);
	}

	public static void main(String[] args) {
		solve();
		System.out.println(sb);
	}

}
