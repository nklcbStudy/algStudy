package bronze;

import java.util.Scanner;

public class B10869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 <= 10000) {

			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println(num1 / num2);
			System.out.println(num1 % num2);
		}

	}

}
