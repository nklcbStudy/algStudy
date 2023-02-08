import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		String chair = sc.next();
		int cnt = 0;
		
		char [] arr = new char[num]; 
		for(int i = 0; i< num; i++) {
			arr[i] = chair.charAt(i);
			if (arr[i] == 'L') {
				cnt++;
			}
		}
		
		if(cnt<2) {
			System.out.println(num);
		}else {
			System.out.println(num - ((cnt/2)-1));
		}
		
		
		
	}
}
