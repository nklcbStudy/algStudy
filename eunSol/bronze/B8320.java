import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 개수 세줄 변수
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
