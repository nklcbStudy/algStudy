package silver;

import java.util.Scanner;
import java.util.Stack;

public class S1874_ {

	static Scanner sc = new Scanner(System.in);

	static StringBuilder sb = new StringBuilder();

	static Stack<Integer> nums = new Stack<>();

	public static void main(String[] args) {

		int t = sc.nextInt();

		int start = 0; // 스택에 아무것도 안쌓여있는 상태

		for (int tc = 0; tc < t; tc++) {

			int num = sc.nextInt();

			if (start < num) { // 마지막으로 쌓았던 숫자가 입력된 숫자보다 작으면?
				for (int i = start + 1; i <= num; i++) { // 1부터 오름차순으로 쌓아야하니까
					nums.push(i);
					sb.append("+\n");
				}
				start = num; // 이미 pop된 것은 다시 스택에 쌓을 필요가 없으므로
				// 마지막으로 쌓았던 숫자를 조정할 필요는 없음
			}

			else if (nums.peek() != num) {
				System.out.println("NO");
				return;
			}

			// peek이 num과 같으면 당연히 일로 내려옴
			// 만약, start가 num보다 작아서 num까지 채울 때에도 일로 내려옴
			nums.pop();
			sb.append("-\n");

		}

		System.out.println(sb);

	}

}
