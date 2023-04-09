package gold;

import java.util.Scanner;

public class G1717 {

	static Scanner sc = new Scanner(System.in);

	static StringBuilder sb = new StringBuilder();

	static int[] parentArr; // 부모 저장

	static int[] rank; // 트리 높이 저장

	public static void input() {
		int n = sc.nextInt();

		int m = sc.nextInt();

		parentArr = new int[n + 1];

		rank = new int[n + 1];

		makeSet(n);

		for (int i = 0; i < m; i++) {
			int methodNum = sc.nextInt();

			int num1 = sc.nextInt();

			int num2 = sc.nextInt();

			switch (methodNum) {
			case 0:
				union(num1, num2);
				break;
			case 1:
				if (findParent(num1) == findParent(num2)) {
					sb.append("YES\n");
				} else {
					sb.append("NO\n");
				}
				break;
			}
		}
	}

	public static void makeSet(int n) {

		for (int i = 1; i < n + 1; i++) {
			parentArr[i] = i;
			rank[i] = 0;
		}
	}

	public static int findParent(int n) {

		if (parentArr[n] == n) {
			return n;
		} else {
			return parentArr[n] = findParent(parentArr[n]);
		}
	}

	public static void union(int n1, int n2) {

		if (findParent(n1) == findParent(n2)) {
			return;
		}

		if (rank[n1] > rank[n2]) {
			parentArr[findParent(n2)] = findParent(n1); // 대표자 자체룰 바꿔버려야 전체가 합집합이 되므로
			// parentArr[n2]가 아니라, parentArr[findParent(n2)]를 n1의 부모로 바꿔버려야함.
		} else {
			parentArr[findParent(n1)] = findParent(n2);

			if (rank[n1] == rank[n2]) {
				rank[n2]++;
			}
		}
	}

	public static void main(String[] args) {

		input();

		System.out.println(sb);

	}

}
