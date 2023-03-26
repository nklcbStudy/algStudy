import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int [N][N];

		
		for(int i=0; i<N;i++) {
			for(int j = 0; j<i+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = N-1; i>=1; i--) {
			for(int j =0; j<i;j++) {
				if(arr[i][j]>=arr[i][j+1]) {
					arr[i-1][j] = arr[i-1][j]+arr[i][j];
				}else {
					arr[i-1][j] = arr[i-1][j]+arr[i][j+1];
				}
			}
		}
		
		System.out.println(arr[0][0]);
	}
	
}