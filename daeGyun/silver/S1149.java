import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	static int n;
	static int [] red= new int[1000];
	static int [] green= new int[1000];
	static int [] blue= new int[1000];
	
	static int [] ans= new int[3];
	static int [] ready= new int[3];
	
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		input();
		check();
		Arrays.sort(ans);
		System.out.println(ans[0]);
		
	}
	
	private static void check() {
		for(int i = 1; i<n; i++) {
			ready[0]= Math.min(red[i]+ans[1], red[i]+ans[2]);
			ready[1]= Math.min(green[i]+ans[0], green[i]+ans[2]);
			ready[2]= Math.min(blue[i]+ans[0], blue[i]+ans[1]);
			
			ans[0] = ready[0];
			ans[1] = ready[1];
			ans[2] = ready[2];
			//System.out.println(Arrays.toString(ans));
		}
	
	}
	
	private static void input() {
		n = sc.nextInt();
		for(int i =0; i<n;i++) {
			red[i] = sc.nextInt();
			green[i] = sc.nextInt();
			blue[i] = sc.nextInt();
			if(i==0) {
				ans[0]=red[i];
				ans[1]=green[i];
				ans[2]=blue[i];
				//System.out.println(Arrays.toString(ans));
			}
		}
	}
		
}