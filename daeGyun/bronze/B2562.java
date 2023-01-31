import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int maxNum = 0;
		for(int i = 0; i < 9; i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		
		int cnt = 1;
		for(int i = 0; i<9; i++) {
			cnt++;
			if(arr[i]==maxNum)break;
		}
		System.out.println(maxNum);
		System.out.println(cnt-1);
	}

}