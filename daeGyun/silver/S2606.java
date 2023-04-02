import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	static boolean [] visit;
	static int N;
	static int [][] arr;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N+1][N+1];
		visit = new boolean[N+1]; 
		
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int row =sc.nextInt() ;
			int col = sc.nextInt();
			arr[row][col] =1;
			arr[col][row] =1;
			
		}
		dfs(1);
		System.out.println(list.size());
		
		
	}
	public static void dfs(int idx) {
		visit[idx] = true;
		//System.out.println(idx);
		for(int i = 0; i<N+1;i++) {
			if(!visit[i] && arr[idx][i]==1) {
				list.add(i);
				dfs(i);
			}
		}
	}
}
