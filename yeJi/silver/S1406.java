package algo;

import java.util.LinkedList;
import java.util.Scanner;

public class S1406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		LinkedList<Character> arr = new LinkedList<>();

		for (int i = 0; i < input.length(); i++) {
			arr.add(input.charAt(i));
		}

		int m = sc.nextInt();

		int cursor = arr.size(); // 맨 뒤에 위치

		for (int i = 0; i < m; i++) {
			char c = sc.next().charAt(0);

			switch (c) {
			case 'L':
				if (cursor != 0) {
					cursor--;
				}
				break;
			case 'D':
				if (cursor != arr.size() - 1) {
					cursor++;
				}
				break;
			case 'B':
				if (cursor != 0) {
					cursor--;
					arr.remove(cursor);
				}
				break;
			case 'P':
				char add = sc.next().charAt(0);
				arr.add(cursor, add);
				cursor++;
				break;
			}
		}

		for (char c : arr) {
			System.out.print(c);
		}

	}

}
