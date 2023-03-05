import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(fac(input(),1)); //메인문 실행
	}
	
	
	public static int input() { //인풋한수 생성
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//입력 받기
		return N;
	}
	
	public static int fac(int N, int M) {//팩토리얼 구하기 재귀
		if (N==0) return 1;//0이면 1출력 해달래
		else if(N==1) return N*M;//1이 되면 그만하고
		else return fac(N-1, N*M);//그전까지는 계속 곱하자
	}
}