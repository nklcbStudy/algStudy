package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B2851 {

	public static void main(String[] args) {
		// 배열에 숫자 저장
		// 인덱스를 하나씩 늘려가며 더한 값을 100으로 빼서
		// 나머지를 새로운 배열에 저장
		// 그 배열을 정렬해서
		// 0번 인덱스랑 끝 인덱스 가져오기

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[0] != 0) { // 입력 받아지면
			int[] result = new int[9]; // 새로운 결과값 저장할 배열 생성

			int sum = 0; // 더한 값 저장할 변수

			for (int i = 0; i < 9; i++) {
				sum = 0; // i가 돌때마다 sum 초기화
				for (int j = 0; j <= i + 1; j++) {
					sum += arr[j];
					// 만약 i가 0이면 0부터 1까지의 인덱스 더하기
					// 만약 i가 7이면 0부터 8까지의 인덱스 더하기
				}
				result[i] = (100 - sum); // 100에 더한 값을 빼서 나머지 배열에 저장하기
				// 100보다 작으면 양수로 나올 것
				// 100보다 크면 음수로 나올 것

			}

			// 배열 정렬하기
			Arrays.sort(result);

			// for문 돌면서 result요소가 0보다 작으면 i 저장
			// 0보다 커짐과 동시에 i저장 후 break;

			// 저장된 i들 가지고 인덱스에 넣어서 값 비교
			// 이때, 마이너스 요소는 절대값으로
			// 마이너스가 작으면 절대값+100
			// 양수가 작으면 100-값

			// 만약 같으면? 절대값+100으로 출력

			// i값 픽스할 변수 저장
			int ma = 0;
			int pul = 0;

			for (int i = 0; i < result.length; i++) {
				if (result[i] < 0) {
					ma = i;
				}
				if (result[i] >= 0) {
					pul = i;
					break; // 바로 for문을 빠져나오게
				}
			}

			// 작은 것 비교
			if ((Math.abs(result[ma]) < result[pul]) || (Math.abs(result[ma]) == result[pul])) {
				System.out.println(Math.abs(result[ma]) + 100);
			} else {
				System.out.println(100 - result[pul]);
			}

		}

	}

}
