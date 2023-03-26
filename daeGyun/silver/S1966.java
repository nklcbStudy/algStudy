import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int tc = sc.nextInt();

        for(int i = 0; i<tc; i++) {
        	LinkedList<int[]> que = new LinkedList<>();
            int N = sc.nextInt();
            int M = sc.nextInt();

            for(int j = 0; j<N; j++) {
                int [] arr = {j, sc.nextInt()};
                que.add(arr);
            }

            int cnt = 0;
            int remJ=0;
            	
            while(true) {
            	int importantN = 0;
                for(int j = 0; j<que.size();j++) {
                	if(importantN<que.get(j)[1]) {
                		importantN = que.get(j)[1];
                		remJ = j;
                		
                	}
                }
                for(int j = 0; j<remJ;j++) {
                	int [] tmp = que.poll();
                			que.add(tmp);
                }
                cnt++;
                if(que.peek()[0]==M) {
                	break;
                }else {
                	que.poll();
                }
                
            }
            System.out.println(cnt);
        }

        
    }
}