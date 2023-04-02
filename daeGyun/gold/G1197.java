import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static int[] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int V = sc.nextInt();
			int E = sc.nextInt();
			

			ans = new int[V+1];
			for(int i = 1; i<=V; i++) {
				ans[i] = i;
			}

			
			int [][] map = new int[E][3];


			for(int i = 0; i<E; i++) {
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();
				map[i][2] = sc.nextInt();
			}

			Arrays.sort(map, new Comparator <int[]>() {
				 @Override
				 public int compare(int[] o1, int[] o2) {
					 return o1[2]-o2[2];
				 }
			 });
			
			
			int pick = 0;
			int key = 0;
			
			for(int j = 0; j<E;j++) {
				int row = map[j][0];
				int col = map[j][1];

				 if(findset(row) != findset(col)) {
					 union(row,col);
					 key += map[j][2];
					 pick++;
				 }
				 if(pick ==(V-1)) break;
			}
			System.out.println(key);
		
	}
	
	static int findset(int x) {

		
		if(x != ans[x]) {
			ans[x] = findset(ans[x]);
		}
		return ans[x];
	}
	
	static void union(int x, int y) {
		ans[findset(y)] = findset(x);
	}
}