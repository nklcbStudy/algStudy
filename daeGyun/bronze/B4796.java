import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L =1;
		int P = 1;
		int V = 1;
		int cnt = 1;
		
		while(true) { //값들을 입력 받아 보아요
			L = sc.nextInt();
			P = sc.nextInt();
			V = sc.nextInt();
			if(L==0 && P==0 && V==0) { //모두 다 0이 되면 그만하세요...5
				break;
			}
			
			//여기서 계산하는 거에요
			int day = V/P;
			int restDay = V-(day*P);
			if(restDay<=L) {//남을 날을 연속으로 이용할 수 있다면
				int finalDay = restDay+(day*L);
				System.out.println("Case "+cnt+": "+finalDay);
				cnt++;
			}else {//남을 날이 연속 이용날 보다 짧다면
				int finalDay = L+(day*L);
				System.out.println("Case "+cnt+": "+finalDay);
				cnt++;
			}
			
			
	
			
		}
	}
}