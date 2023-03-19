import java.util.Scanner;

public class S2527 {

	static Scanner sc = new Scanner(System.in);
	static int[] x = new int[2];
	static int[] y = new int[2];
	static int[] p = new int[2];
	static int[] q = new int[2];
	static int xDiff;
	static int yDiff;
	
	static void input() {
		for (int i = 0; i < 2; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		int highX = Math.max(x[0], x[1]);
		int highY = Math.max(y[0], y[1]);
		int lowP = Math.min(p[0], p[1]);
		int lowQ = Math.min(q[0], q[1]);
		xDiff = highX - lowP;
		yDiff = highY - lowQ;
	}

	static void checkRectangle() {
		if(xDiff > 0 || yDiff > 0) {
			System.out.println("d");
		} else if(xDiff == 0 && yDiff == 0) {
			System.out.println("c");
		} else if((xDiff == 0 && yDiff != 0) || (yDiff == 0 && xDiff != 0)) {
			System.out.println("b");
		} else {
			System.out.println("a");
		}
	}

	static void solve() {
		for (int i = 0; i < 4; i++) {
			input();
			checkRectangle();
		}
	}

	public static void main(String[] args) {
		solve();
	}
}