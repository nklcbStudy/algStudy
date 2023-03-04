import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i =0; i<tc; i++) {
			int n = sc.nextInt();
			
			int [] arr = new int[n+1];
	
			for(int j = 1; j<=n;j++ ) {
				if(j==1) {
					arr[1] = 1;
				}else if(j==2) {
					arr[2] = 2;
				}else if(j==3){
					arr[3] = 4;
				}else {
					arr[j] = arr[j-3]+arr[j-2]+arr[j-1];
				}
			}
			
			
			System.out.println(arr[n]);
		}
		
	}
		
}