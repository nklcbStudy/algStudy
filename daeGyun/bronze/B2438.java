import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i>0;i--) {
			for(int j = i; j<num+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}