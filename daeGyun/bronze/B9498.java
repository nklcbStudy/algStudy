import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k>=90) {
			System.out.println("A");
		}else if(k>=80){
			System.out.println("B");
		}else if(k>=70){
			System.out.println("C");
		}else if(k>=60){
			System.out.println("D");
		}else System.out.println("F");
		
	}
}