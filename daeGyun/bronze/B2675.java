import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int k = sc.nextInt();
			String k2 = sc.next();
			for(int z = 0; z<k2.length();z++) {
				for(int j = 0; j<k;j++) {
					char cha = k2.charAt(z);
					System.out.print(cha);
				}
				
			}
			System.out.println();
		}
	}	
}