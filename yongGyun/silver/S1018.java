import java.util.Scanner;

public class S1018 {

	static int n;
	static int m;
	static char[][] inputArr = new char[50][50];
	static int ans = 65;

	static void inputProblem() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int y = 0; y < n; y++) {
			String tmpInput = sc.next();
			for (int x = 0; x < m; x++) {
				inputArr[y][x] = tmpInput.charAt(x);
			}
		}
	}

	static int compareBarr(int startY, int startX) {
		int tmpAns = 0;
		char[][] bArr = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
				{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };
		
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (inputArr[y + startY][x + startX] != bArr[y][x]) {
					tmpAns++;
				}
			}
		}
		return tmpAns;
	}

	static int compareWarr(int startY, int startX) {
		int tmpAns = 0;
		char[][] wArr = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
				{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' } };
		
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (inputArr[y + startY][x + startX] != wArr[y][x]) {
					tmpAns++;
				}
			}
		}

		return tmpAns;
	}

	static void solve() {
		for (int y = 0; y < n - 7; y++) {
			for (int x = 0; x < m - 7; x++) {
				ans = Math.min(ans, compareWarr(y, x));
				ans = Math.min(ans, compareBarr(y, x));
			}
		}
	}

	public static void main(String[] args) {
		inputProblem();
		solve();
		System.out.println(ans);
	}
}