import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45 <0) {
			if(h == 0) {
				h = 23;
				m = m+15;
			}else {
				h = h-1;
				m = m+15;
			}
		}else {
			m = m-45;
		}
		System.out.println(h+" "+m);
    }
}