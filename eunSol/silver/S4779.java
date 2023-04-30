import java.util.Scanner;

public class Main {

	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) { // 입력값 몇 갠지 안 알려줬을 때
			int n = sc.nextInt(); // n값
			int length = (int) Math.pow(3, n); // 3의 n제곱
			sb = new StringBuilder();
			for (int i = 0; i < length; i++) { // 길이만큼 - 만들어주기 
				sb.append('-');
			}
			cantor(0, length); // 재귀
			System.out.println(sb);
		}
	}

	// 칸토어 집합
	// start : 시작할 곳
	// cutSize : 자를 크기
	static void cantor(int start, int cutSize) {
		if (cutSize == 1) { // 1이면 끝
			return;
		}
		int tmpSize = cutSize / 3; // 지금 자를 크기
		for (int i = start + tmpSize; i < start + (2 * tmpSize); i++) { // 가운데 부분 공백 만들기
			sb.setCharAt(i, ' ');
		}
		cantor(start, tmpSize); // 왼쪽
		cantor(start + (2 * tmpSize), tmpSize); // 오른쪽
	}
}