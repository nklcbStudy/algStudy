import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[1001][1001];
		for (int i = 1; i <= n; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int nr = sc.nextInt();
			int nc = sc.nextInt();

			for (int j = r; j < r + nr; j++) {
				for (int k = c; k < c + nc; k++) {
					map[j][k] = i;
				}
			}
		}
		for (int idx = 1; idx <= n; idx++) {
			int cnt = 0;
			for (int j = 0; j < 1001; j++) {
				for (int k = 0; k < 1001; k++) {
					if (map[j][k] == idx) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
