import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1부터 다 더하고
		// 가장 먼저 n이 된 애들 구하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i < n; i++) {
			int num = i;
			int sum = 0;
			while(num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			if(sum + num == n)		
		}
		System.out.println();
	}
}
