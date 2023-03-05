import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num = sc.nextInt();
		
		int aa = num/a;
		int bb = num/b;
		int cc = num/c;
		
		int ans = 0;
		
		outerLoop :
		for(int i = 0; i<aa+1;i++) {
			for(int j=0; j<bb+1;j++) {
				for(int k = 0; k<cc+1;k++) {
					if (a*i+b*j+c*k==num) {
						ans = num;
						System.out.println(1);
						break outerLoop;
					}
				}
			}
		}
		
		if(ans==0) System.out.println(0);
	}

}
