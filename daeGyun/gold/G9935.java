import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int N = str.length();
		String bomb = sc.next();
		StringBuilder sb = new StringBuilder();
		Stack<Character> fst = new Stack<>();
		Stack<Character> wait = new Stack<>();

		
		int idx = 0;
		for(int i = N-1; i>=0; i--) {
			fst.add(str.charAt(i));	
		}
		
		while(!fst.empty()) {

			if(fst.peek() != bomb.charAt(0)) {
				idx = 0;
				if(!wait.empty()) {
					int a = wait.size();
					for(int i = 0; i<a; i++) {
						fst.add(wait.pop());
					}
					for(int i = 0; i<a; i++) {
						sb.append(fst.pop());
					}
				}
				sb.append(fst.pop());

			}else {
				while(!fst.empty() && (fst.peek()==bomb.charAt(idx) || fst.peek()==bomb.charAt(0))) {
					if(fst.peek()==bomb.charAt(idx)) {
						wait.add(fst.pop());
						idx++;
					}else if(fst.peek()==bomb.charAt(0)) {
						wait.add(fst.pop());
						idx = 1;
					}
					
					if(idx == bomb.length()) {
						//System.out.println(wait + " "+ idx);
						for(int i = 0; i< idx; i++) {
							wait.pop();
							
						}
						idx = 0;
						if(!wait.empty()) {
							for(int j = 0; j<bomb.length();j++) {
								if(bomb.charAt(j)==wait.peek()) {
									idx = j+1;
								}
							}
						}
					}
				}
			}
		}
		if(!wait.empty()) {
			int ttt = wait.size();
			for(int i = 0; i<ttt;i++) {
				sb.append(wait.pop());
			}
		}

		if(sb.length() ==0) {
			System.out.println("FRULA");
		} else System.out.println(sb);
	}
}
