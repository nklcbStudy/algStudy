import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
			
		int [] arrV = new int[V+1];
		int [][] arrE = new int[E][2];
		Queue<Integer> que = new LinkedList<>();

		
		for(int i = 0; i<E;i++) {
			arrE[i][0] = sc.nextInt();
			arrE[i][1] = sc.nextInt();
			arrV[arrE[i][1]]++;
		}

		
		for(int i = 1; i<=V; i++ ) {
			if(arrV[i]==0) {
				que.add(i);
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		while(!que.isEmpty()) {
			int tmp = que.poll();
			sb.append(tmp).append(" ");
			
			for(int i = 0; i<E;i++) {
				if(arrE[i][0]== tmp) {
					arrV[(arrE[i][1])]--;
					if(arrV[(arrE[i][1])]==0) {
						que.add(arrE[i][1]);
					}
				}
			}
		}
		System.out.println(sb);
		
	}
}