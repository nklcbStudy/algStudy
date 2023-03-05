import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[8];
		
		for(int i = 0; i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0]>arr[1]&&arr[1]>arr[2]&&arr[2]>arr[3]&&arr[3]>arr[4]&&arr[4]>arr[5]&&arr[5]>arr[6]&&arr[6]>arr[7]) {
			System.out.println("descending");
		}else if(arr[0]<arr[1]&&arr[1]<arr[2]&&arr[2]<arr[3]&&arr[3]<arr[4]&&arr[4]<arr[5]&&arr[5]<arr[6]&&arr[6]<arr[7]) {
			System.out.println("ascending");
		}else System.out.println("mixed");
			
		
	}
}