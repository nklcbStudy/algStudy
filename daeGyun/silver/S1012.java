import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
    static boolean [][] visit;
    static int [] delX= {0,1,0,-1};
    static int [] delY= {1,0,-1,0};
    static int chunk;
	

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
         
        for(int i = 1; i<=tc;i++) {
             N = sc.nextInt();
             M = sc.nextInt();
             int K = sc.nextInt();

             visit = new boolean[N][M];
              
             for(int j = 0; j<K;j++) {
                 
                 visit[sc.nextInt()][sc.nextInt()] = true;
             }
             
             chunk = 0;
             counting();           
             System.out.println(chunk);
              
              
        }
    }
     

     
     
    public static void counting() {
         
         for(int j = 0; j<N;j++) {
             for(int k = 0; k<M; k++) {
                 if(visit[j][k]) {
                    visit[j][k] = false;
              
                    int currX = j;
                    int currY = k;
              
                    catting(currX, currY);
                    chunk++;
                 }      
             }
         }
    }
     
    public static void catting(int currX, int currY) {
 
        for(int idx = 0; idx<4; idx++) {
            if(currX+delX[idx]>=0 && currX+delX[idx]<N && currY+delY[idx]>=0 && currY+delY[idx]<M && visit[currX+delX[idx]][currY+delY[idx]]) {
                visit[currX+delX[idx]][currY+delY[idx]] = false;
                catting(currX+delX[idx],currY+delY[idx]);
            }
        }
    }
     
     
}