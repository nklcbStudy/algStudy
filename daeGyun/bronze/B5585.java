import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//500, 100, 50, 10, 5, 1
		Scanner sc = new Scanner(System.in);
		int price =  sc.nextInt();//가격 입력
		int exchange = 1000-price; //거슬러 줘야하는 돈
		int cnt = 0;//횟수
		
		while(exchange >0) { //0원 보다 값이 크면 게속 반복
			if(exchange>=500) {
				exchange = exchange-500; //500으로 뺄 수 있으면 빼고
				cnt++;//카운트 해주고
			}else if(exchange>=100) {
				exchange = exchange-100;
				cnt++;
			}else if(exchange>=50) {
				exchange = exchange-50;
				cnt++;
			}else if(exchange>=10) {
				exchange = exchange-10;
				cnt++;
			}else if(exchange>=5) {
				exchange = exchange-5;
				cnt++;
			}else {//다 안되면 1원씩 빼자
				exchange = exchange-1;
				cnt++;
			}
		}
		
		System.out.println(cnt);//횟수 출력
		
	}
}