import java.util.Scanner;

public class Main {
	
	static long [] numarr;
	static char[] buhoArr;
	static long minN = 1000000000;
	static long maxN = -1000000000;
	static boolean [] visit;
	static int num;
	static char [] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		numarr = new long [num];
		buhoArr = new char [num-1];
		visit = new boolean[num-1];
		ans = new char [num-1];
		
		for(int i = 0; i<num;i++) {
			numarr[i] = sc.nextInt();
		}
		
		int buhoidx = 0;
		for(int i = 0; i<4;i++) {
			int tmp1 = sc.nextInt();
			
			for(int j=0;j<tmp1;j++) {
				//System.out.println(i);
				if(i == 0) {
					buhoArr[buhoidx++] = '+';
				}else if(i==1) {
					buhoArr[buhoidx++] = '-';
				}else if(i==2) {
					buhoArr[buhoidx++] = '*';
				}else if(i==3) {
					buhoArr[buhoidx++] = '/';
				}
				//System.out.println(Arrays.toString(buhoArr));
			}
		}
		//System.out.println(Arrays.toString(buhoArr));
		making(0);
		System.out.println(maxN);
		System.out.println(minN);
	}
	public static void making(int idx) {
		if (idx == num-1) {
			long fst = cal(numarr[0],numarr[1],ans[0]);

			//System.out.println(fst);
			for(int i = 2; i<num;i++) {
				
				fst = cal(fst,numarr[i],ans[i-1]);
				//fst = cal(fst,numarr[i],ans[i-1]);
			}
			//System.out.println(Arrays.toString(ans));
			//System.out.println(tmpN);
			if(fst>maxN) {
				maxN=fst;
				
			} 
			if(fst<minN) {
				minN =fst;
			}
			return;
		};
		
		for(int i = 0; i< num-1; i++) {
			if(visit[i]) {
				continue;
			}
			ans[idx]= buhoArr[i];
			visit[i]=true;
			making(idx+1);
			visit[i]=false;
		}
	}
	
	
	public static long cal(long num1, long num2, char buho) {
		if(buho == '+') {
			return num1+num2; 
		}if(buho == '-') {
			return num1-num2;
		}if(buho == '*') {
			return num1*num2;
		}else {
			return num1/num2;
		}
	}
	
}