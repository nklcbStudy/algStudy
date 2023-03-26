import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		int [] arrC = new int[N];
		
		Stack<Integer> stack = new Stack<>();
		List<Character> list = new ArrayList<>();
		
		for(int i =0; i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int cnt = 0;
		
		for(int i = 1; i<=N; i++) {
			if (stack.empty()) {
				stack.push(i);
				list.add('+');
			}else if(stack.peek()==arr[cnt]) {
				arrC[cnt] = stack.pop();
				list.add('-');
				cnt++;
				i--;
			}else if(stack.peek()!=arr[cnt]) {
				stack.push(i);
				list.add('+');
			}
		}
		
		int lenlen = stack.size();
		for(int i = 0; i<lenlen;i++) {
			arrC[cnt] = stack.pop();
			cnt++;
			list.add('-');
		}
		
		boolean cheche = true;
		for(int i = 0; i<N;i++) {
			if(arr[i]!=arrC[i]) {
				cheche =false;
				break;
			}
		}
		
		if(cheche) {
			for(int i = 0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}else System.out.println("NO");

		//System.out.println();
		
	}
}