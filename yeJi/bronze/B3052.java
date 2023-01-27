package bronze;

import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력
		int [] arr = new int [10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 나머지 저장 배열
		int [] na = new int [10];
		for (int i = 0; i < na.length; i++) {
			na[i]=arr[i]%42;
		}
		
		// 이중for문으로 하나하나 찾아내기
		// 개수 저장
		int cnt = 1; // 첫 나머지 개수 1
		for (int i = 0 ; i < na.length; i++) {
			for (int j = i+1; j < na.length; j ++) {
				if(na[i] != na[j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
