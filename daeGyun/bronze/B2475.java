import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k =0;
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			k = k+(num*num);
		}
		System.out.println(k%10);
		
	}

}