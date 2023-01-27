package bronze;

import java.util.Scanner;

public class B1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (s.length() <= 1000000) {

			String[] arr = s.split(" ");

			int length = arr.length;
		
			if (arr[0].equals("") || arr[length - 1].equals("")) {
				length--;
			}

			System.out.println(length);
		}
	}

}
