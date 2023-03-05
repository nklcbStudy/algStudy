import java.util.Scanner;

public class S18511 {

	static Scanner sc = new Scanner(System.in);
	static int n;
	static int k;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	static int ans;
	static int strNum;
	
	static void input() {
		n = sc.nextInt();
		k = sc.nextInt();
		arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		strNum = String.valueOf(n).length();
	}

	static void makeNum(int idx) {
		if(idx > strNum - 2) {
			int tmp = Integer.parseInt(sb.toString());
			if(tmp <= n && tmp > ans) {
				ans = tmp;
			}
		}
		
		if(idx == strNum) {
			return;
		}
		
		for (int i = 0; i < k; i++) {
			sb.append(arr[i]);
			makeNum(idx + 1);
			sb.delete(idx, idx + 1);
		}
	}

	static void solve() {
		input();
		makeNum(0);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		solve();
	}
}