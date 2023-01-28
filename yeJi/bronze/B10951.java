package bronze;

import java.util.Scanner;

public class B10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a < 0 && a > 10 && b < 0 && b > 10) {
				break;
			} else {
				System.out.println(a + b);
			}
		}
	}

}
