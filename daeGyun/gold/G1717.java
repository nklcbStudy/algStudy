import java.util.Scanner;

public class Main {
	
	static int [] arr;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 //int tc = sc.nextInt();
		 
		 for(int i = 1; i<= 1; i++) {
			 int N = sc.nextInt();
			 int M = sc.nextInt();
			 
			 arr = new int [N+1];
			 for(int j = 0; j<=N;j++) {
				 arr[j] = j;
			 }
			 
			 int [][] ode = new int [M][3];
			 for(int j = 0; j<M; j++) {
				 ode[j][0] = sc.nextInt();
				 ode[j][1] = sc.nextInt();
				 ode[j][2] = sc.nextInt();
			 }
			 
			 //String str = "#"+i+" ";
			 
			 for(int j = 0; j<M; j++) {
				 if(ode[j][0]==0) {
					 union(ode[j][1],ode[j][2]);

				 }else{
					 if(findset(ode[j][1])==findset(ode[j][2])) {
						 
						 System.out.println("YES");
						 
					 }else System.out.println("NO");
				 }
				 
			 }
			 //System.out.println(str);
		 }
	}
	
	public static int findset(int idx) {
		if(idx !=arr[idx]) {
			arr[idx] = findset(arr[idx]);
		}
		return arr[idx];
	}
	
	public static void union(int x, int y) {
		arr[findset(y)] = findset(x);
	}
}
