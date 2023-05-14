package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class S1325 {

	// DFS 사용하자
	// count 해주고 재귀 끝나면 하나의 배열에 해당 인덱스에 그 카운트 저장
	// 카운트 max값 찾고 오름차순으로 출력해주기
	// 인접행렬로 했더니 메모리 초과가 났어...
	// 그러면 인접리스트로 해주자

	static Scanner sc = new Scanner(System.in);
	static int n; // 컴퓨터 개수
//	static int[][] adjArr; // 인접 행렬
	static ArrayList<ArrayList<Integer>> adjList;
	static boolean[] visited; // 박문철2
	static int count; // 얼마나 깊게 들어갔냐를 체크
	static int[] result; // 카운트 저장할 배열

	public static void input() {
		n = sc.nextInt();
		int m = sc.nextInt();

		adjList = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[n + 1];
		result = new int[n + 1];

		// 각 list 원소마다 또 List를 할당해주어야함.
		for (int i = 0; i < n + 1; i++) { // 각 노드 번호를 그대로 인덱스로 사용하기 위해 n+1을 범위로 잡아 하나 더 방을 만듦
			adjList.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();

			adjList.get(node2).add(node1); // 인접 리스트에 추가
		}
	}

	public static void DFS(int v) {
		visited[v] = true;

		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				int size = adjList.get(v).size();
				for (int j = 0; j < size; j++) {
					if (adjList.get(v).get(j) == i) {
						count++;
						DFS(i);
						// 호출 완료 됐으면 return! (끝까지 깊게 갔단 이야기이므로)
						return;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		input();
		for (int i = 1; i < n + 1; i++) {
			Arrays.fill(visited, false);
			count = 0;
			DFS(i);
			result[i] = count;
		}

		// max값 찾기
		int max = 0;
		int idx = 0;

		for (int i = 1; i < n + 1; i++) {
			if (max <= result[i]) {
				max = result[i];
				idx = i;
			}
		}

		// max값을 가지고 있는 result 인덱스 출력
		for (int i = 1; i < n + 1; i++) {
			if (max == result[i]) {
				System.out.print(i);
				if (idx != i) {
					System.out.print(" ");
				}
			}
		}

	}

}
