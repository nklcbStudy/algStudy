import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		//우선 4의 베수
		//100 배수 안딤, 그래도 400배수느 가능
		if (k%4==0) {
			if(k%100!=0 || k%400==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
			
		}else {
			System.out.println(0);
		}
		
		
		
	}

}