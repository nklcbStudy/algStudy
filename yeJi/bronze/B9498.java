package bronze;

import java.util.Scanner;

public class B9498 {

	public static String score(int s) {
		// 매개변수로 int를 받으면
		// if문으로 등급 매김

		if (s >= 90 && s <= 100) {
			return "A";
		} else if (s >= 80 && s <= 89) {
			return "B";
		} else if (s >= 70 && s <= 79) {
			return "C";
		} else if (s >= 60 && s <= 69) {
			return "D";
		} else
			return "F";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		System.out.println(score(score));

	}

}
