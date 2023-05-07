import java.io.IOException; 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int cnt = 0;
	static int out = 0;
	static int[] arr;
	static int rtmp = 0;
	static int ltmp = 0;;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
	
		arr = new int [N];
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i<M; i++) {
			que.add(sc.nextInt());
		}
		
		for(int i = 0; i<M ; i++) {
			rtmp = out;
			int rc = 0;
			while(que.peek() != arr[rtmp]) {
				rc = right(rc);
			}
			
			ltmp = out;
			int lc = 0;
			while(que.peek() != arr[ltmp]) {
				lc = left(lc);
			}
			
			cnt = cnt + Math.min(rc, lc);
			que.poll();
			arr[rtmp] = 0;
			
			out = rtmp+1;
			if(out>=N) {
				out = 0;
			}
			
			int breakcnt = 0;
			while(arr[out]==0){
				out =out+1;
				if(out>=N) {
					out = 0;
				}
				breakcnt++;
				if(breakcnt>M) {
					break;
				}
			}	
		}
		System.out.println(cnt);
		
	}
	
	public static int right( int cc) {
		rtmp++;
		if(rtmp>=N) {
			rtmp = 0;
		}
		
		if(arr[rtmp]==0) {
			return cc;
		}
		
		return cc+1;
	}
	
	public static int left(int cc) {
		ltmp--;
		if(ltmp<0) {
			ltmp = N-1;
		}
		
		if(arr[ltmp]==0) {
			return cc;
		}
		
		return cc+1;
	}
}