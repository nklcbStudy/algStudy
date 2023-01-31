import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int [] arr = new int[k];
		int maxx = -1000001;
		int minn = 1000001;
		
		for(int i = 0; i<k;i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i<k;i++) {
			if(arr[i]>maxx) {
				maxx = arr[i];
			}
		}
		for (int i = 0; i<k;i++) {
			if(arr[i]<minn) {
				minn = arr[i];
			}
		}
		
		System.out.println(minn+" "+maxx);
		
	}
}