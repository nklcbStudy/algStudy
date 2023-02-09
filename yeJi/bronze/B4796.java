package bronze;

import java.util.Scanner;

public class B4796 {

	public static void main(String[] args) {
		// 먼저, 입력이 계속 될 때 String으로 한 줄씩 입력 받고,
		// String을 공백기준으로 쪼개서 String 배열에 넣기
		// 그리고, 배열에 인덱스 주고, Integer.parse써서 int배열에 넣어주기

		// 강산이는 휴가 내내 연속하는 입력값

		Scanner sc = new Scanner(System.in);
		int[] days = new int[3];

		int i = 1;

		if (sc.hasNext()) {
			String s = sc.nextLine();

			String[] arr = s.split(" ");

			for (int j = 0; j < days.length; j++) {
				days[j] = Integer.parseInt(arr[j]);
			}

		}
		
		if (days[0] != 0) {
			int useDay = (days[2] / days[1]) * days[0] + (days[2] % days[1]);

			System.out.println("Case " + i + ": " + useDay);

			i++;
		}

	}

}
