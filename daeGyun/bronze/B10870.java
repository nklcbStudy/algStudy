import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(fib(input(), 0, 1)); //피보나치 0,1 넣고 실행
	}


public static int fib(int n,int a1, int a2) {
	if (n==0) return a1; //0값과 1값은 주어지기 때문
	else if(n==1) return a2;
	else if(n==2) return a1+a2;//그래서 2번쩨 수부터 이방법을 쓰지
	else{
		return fib(n-1,a2,  a1+a2); //n이 0이 될때까지 돌려봅시다
		}
	
	}
public static int input() {// 인풋함수 생성
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		return inputNum;  
	}

}