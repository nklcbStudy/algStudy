import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 라운드 수
		int n = sc.nextInt();
		// 라운드 수만큼 진행
		for(int i = 0; i < n; i++) {
			// a 카드 수
			int aNum = sc.nextInt();
		// a 카드집 (도형이 1~4니까 5크기로 만듦)
			int[] aCard = new int[5];
			// 카드집에 도형 개수 넣어주기
			for(int j = 0; j < aNum; j++) {				
				aCard[sc.nextInt()]++;
			}
			// b도 똑같이 한다.
			int bNum = sc.nextInt();
			int[] bCard = new int[5];
			for(int j = 0; j < bNum; j++) {
				bCard[sc.nextInt()]++;
			}
			// 딱지게임 시작
			// 별이 4니까 4부터 비교한다.
			boolean flag = false;
			for(int j = 4; j > 0; j--) {
				// a카드 도형 개수가 많으면 a
				if(aCard[j] > bCard[j]) {
					System.out.println('A');
					break;
					// 아니면 b
				}else if(aCard[j] < bCard[j]) {
					System.out.println('B');
					break;
				}
				// 마지막 도형인데 개수가 같으면
				if(j == 1 && aCard[j] == bCard[j]) {
					flag = true;
				}
				// d출력
				if(flag) {
					System.out.println('D');
				}
			}
		}
	}
}
