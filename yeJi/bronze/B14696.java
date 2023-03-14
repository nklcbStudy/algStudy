package day0314;

import java.util.Arrays;
import java.util.Scanner;

public class B14696 {

	// �̸� ������ ������ �迭�� �����,
	// �Է¹��� ������ �ε���ȭ �ؼ� �迭++���ְ�
	// while ������
	// �� �迭 ���� ���ؼ�
	// A�̳� B�̳� ���� ���ϱ�
	// ����, ���Ұ� ���ٴ� ���� -> �Ȱ��� ������ ���Դٴ� �̾߱�ϱ�
	// �ε��� �÷��� ���� ī�� Ȯ�����ֱ�

	static Scanner sc = new Scanner(System.in);

	// �� �� ���� ������ֱ� ����
	static StringBuilder sb = new StringBuilder();

	static int[] cardA; // A�� ���� ����

	static int[] cardB;

	static char result;

	public static void input() {
		int n = sc.nextInt();

		cardA = new int[5]; // �ε����� 1~4���� �־�� �ϴϱ�
		cardB = new int[5];

		for (int i = 0; i < n; i++) {
			int card = sc.nextInt();
			cardA[card]++;
		}

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int card = sc.nextInt();
			cardB[card]++;
		}

		solved();
	}

	public static void solved() {
		int i = 4;
		while (i >= 1) {

			if (cardA[i] == cardB[i]) {
				result = 'D';
				i--;
			} else if (cardA[i] > cardB[i]) {
				result = 'A';
				break;
			} else {
				result = 'B';
				break;
			}
		}

		sb.append(result + "\n");
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			input();
		}

		System.out.println(sb.toString());

	}

}
