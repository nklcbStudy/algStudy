package bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		String s1 = "";

		List<String> arr = new ArrayList<>();

		if (t >= 1 && t <= 1000) {
			while (t > 0) {

				int r = sc.nextInt();
				sc.nextLine();

				if (r >= 1 && r <= 8) {

					String s = sc.nextLine();

					if (s.length() >= 1 && s.length() <= 20) {
						for (int i = 0; i < s.length(); i++) {
							s1 += ((char) s.charAt(i) * r); // String의 substring 사용(시작인덱스, 끝 인덱스)
							// String의 repeat 함수 사용 (문자열 반복)
						}
						System.out.println(s1);
						arr.add(s1);
					}
				}

				t--;
			}

			for (String s : arr) {
				System.out.println(s);
			}
		}

	}

}
