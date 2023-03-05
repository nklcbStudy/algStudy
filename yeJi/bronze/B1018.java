package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class B1018 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.nextLine();

		char[][] arr = new char[n][m];

		for (int i = 0; i < arr.length; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		int cnt = 0;

		int min = Integer.MIN_VALUE;

		int z = 0; // 한 정사각형이 끝나면, 다음 정사각형으로 움직이기 위해

		while (z < n - 8) {
			cnt = 0;
			for (int i = 0; i < n - 8; i++) {
				for (int j = i + 1; j < m - 8; j++) {
					if (arr[i][0] == 'W') {

					}
				}
			}
			z++;
		}
	}

}
