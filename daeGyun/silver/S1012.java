import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
	static int [ ] arr;
	static int [ ] ans;
	static List<String> list = new ArrayList<>();
	static LinkedHashSet<String> set;
	static boolean [] visit; 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int [N];
		ans = new int[M];
		visit = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		set =new LinkedHashSet<>();
		backing(0);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//System.out.println(set);
	}
	
	public static void backing(int ansIdx) {
		if (ansIdx == M) {
			String str="";
			for(int i = 0; i<M;i++) {
				str = str+ans[i];
				if(i!=M-1) {
					str = str+" ";
				}
			}
			set.add(str);
			return;
		}
		
		for(int i = 0; i<N;i++) {
			if(visit[i]) {
				continue;
			}
			ans[ansIdx]=arr[i];
			visit[i] = true;
			
			backing(ansIdx+1);
			visit[i] =false;
		}
		
	}
}