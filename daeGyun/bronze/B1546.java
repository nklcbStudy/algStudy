import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		for (int i =0 ; i <num ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxNum = 0;
		for( int i = 0; i<num; i++) {
			if (arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		
		double appNum = 0;
		for(int i = 0; i <num; i++) {
			appNum = appNum + ((double) arr[i]/maxNum)*100;
		}
		

		System.out.println(appNum/num);
	}

}