package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String stringA = sc.next();
		String stringB = sc.next();

		int[] aArr = new int[stringA.length()];
		int[] bArr = new int[stringB.length()];

		for (int i = 0; i < stringA.length(); i++) {
			aArr[i] = stringA.charAt(i) - 48;
			bArr[i] = stringB.charAt(i) - 48;
		}

		for (int i = 0; i < stringA.length(); i++) {
			if (aArr[i] == 6) {
				aArr[i] = 5;
			}
			if (bArr[i] == 6) {
				bArr[i] = 5;
			}
		}
		StringBuilder aSb = new StringBuilder();
		StringBuilder bSb = new StringBuilder();

		for (int i = 0; i < stringA.length(); i++) {
			aSb.append(aArr[i]);
			bSb.append(bArr[i]);
		}
		Integer.parseInt(aSb.toString());
		Integer.parseInt(bSb.toString());
		System.out.print(Integer.parseInt(aSb.toString()) + Integer.parseInt(bSb.toString()) + " ");

		for (int i = 0; i < stringA.length(); i++) {
			if (aArr[i] == 5) {
				aArr[i] = 6;
			}
			if (bArr[i] == 5) {
				bArr[i] = 6;
			}
		}
		StringBuilder maSb = new StringBuilder();
		StringBuilder mbSb = new StringBuilder();

		for (int i = 0; i < stringA.length(); i++) {
			maSb.append(aArr[i]);
			mbSb.append(bArr[i]);
		}
		Integer.parseInt(maSb.toString());
		Integer.parseInt(mbSb.toString());
		System.out.print(Integer.parseInt(maSb.toString()) + Integer.parseInt(mbSb.toString()));
	}
}
