package silver;

import java.util.Arrays;
import java.util.Scanner;

public class S15655 {

	static StringBuilder sb = new StringBuilder();
	static int n;
	static int m;
	static int[] arr;
	static int[] nums; // 숫자 입력받을 배열

	static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		nums = new int[n]; // 숫자 입력 받아 배열 만들기
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		// 배열 정렬
		// 오랜만에 버블 정렬로 해볼까
		for (int row = 0; row < n - 1; row++) {
			for (int col = 0; col < n - 1; col++) {
				if (nums[col] > nums[col + 1]) {
					int tmp = nums[col];
					nums[col] = nums[col + 1];
					nums[col + 1] = tmp;
				}
			}
		}
		arr = new int[m]; // 숫자 쌓기
	}

	static void makeProgression(int cnt) { // cnt는 출력시 위치를 나타냄
		// start는 출력될 숫자가 시작할 위치
		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {

			arr[cnt] = nums[i]; // 출력시 0번째자리에 i

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
