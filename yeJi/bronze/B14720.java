package bronze;

import java.util.Scanner;

public class B14720 {

	public static int solve(int[] arr) {

		int j = 0;
		int count = 1; // 맨 처음에는 딸기우유를 무조건 한 팩 마시기 때문
		while (j < arr.length) {
			if (arr[j] == 0) {
				for (int i = j + 1; i < arr.length; i++) {
					switch (arr[i - 1]) {
					case 0:
						if (arr[i] == 1) {
							count++;
						}
						break;
					case 1:
						if (arr[i] == 2) {
							count++;
						}
						break;
					case 2:
						if (arr[i] == 0) {
							count++;
						}
						break;
					}
				}
			}
			j++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받은 수만큼의 크기로 배열 만들기
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solve(arr));

	}

}
