import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static boolean [] visit;
    static int N;
    static int [][] arr;
    static int didx = 0;
    static int bidx = 0;
    static int [] ansD;
    static int [] ansB;
    static Queue<Integer> queue = new LinkedList<>();
    static int V;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        V = sc.nextInt();
        ansD = new int [V];
        ansB = new int [V];
        
        N = sc.nextInt();
        int point = sc.nextInt();
        
        arr = new int[V+1][V+1];
        visit = new boolean[V+1]; 
        
        for(int i = 0; i<N; i++) {
            int row =sc.nextInt() ;
            int col = sc.nextInt();
            arr[row][col] =1;
            arr[col][row] =1;
            
        }
        dfs(point);
        for(int i = 0; i<V;i++) {
        	if(ansD[i]==0) {
        		break;
        	}
        	if(i!=0) {
                System.out.print(" ");
            }
        	System.out.print(ansD[i]);
            
        }
        
        System.out.println();
        for(int i = 0 ;i<V+1;i++) {
            visit[i]=false;
        }
        
        bfs(point);
        for(int i = 0; i<V;i++) {
        	if(ansB[i]==0) {
        		break;
        	}
        	if(i!=0) {
                System.out.print(" ");
            }
        	System.out.print(ansB[i]);
        }
        
        
    }
    public static void dfs(int idx) {
        visit[idx] = true;
        ansD[didx++] = idx;
        for(int i = 0; i<V+1;i++) {
            if(!visit[i] && arr[idx][i]==1) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int idx) {
        queue.add(idx);
        visit[idx] = true;
        ansB[bidx++] = idx;
        while(!queue.isEmpty()) {
            
            int curr = queue.poll();
            
            for(int i = 0; i<V+1; i++) {
                if(!visit[i] && arr[curr][i]==1) {
                    queue.add(i);
                    ansB[bidx++] = i;
                    visit[i] = true;
                }
            }
        }
    }
}