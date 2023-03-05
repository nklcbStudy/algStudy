import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1S = sc.next();
		String num2S = sc.next();
	
		int num1S5 =Integer.parseInt( num1S.replace("5", "6"));
		int num1S6 = Integer.parseInt(num1S.replace( "6","5"));
		
		int num2S5 = Integer.parseInt(num2S.replace("5", "6"));
		int num2S6 = Integer.parseInt(num2S.replace( "6","5"));
		

	
			

		System.out.println((num1S6+num2S6)+" "+(num1S5+num2S5));
				
	}
}