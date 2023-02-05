import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();//숫자 입력
		int F = sc.nextInt();//위치 입력
		
		//입력 받은 큰수의 뒤의 두자리 00~99까지 범위 생성
		int mod = N%100;
		int minN = N-mod;
		int maxN = minN+99;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//입력 받은 작은 수로 나누었을때 나머지가 0인 수들만 추출
		for(int i = minN; i<maxN+1; i++) {
			if (i%F==0) {
				list.add(i);
			}
		}
		
		
		//가장 작은 수 추출
		int min = 2000000100 ;
		for(int i = 0; i<list.size() ;i++) {
			if (list.get(i)<min) {
				min = list.get(i);
			}
		}
		
		//뒤에 두개만 추출
		String ans = Integer.toString(min);//숫자를 문자로
		int ansSize = ans.length();//문자열 길이
		String ans2 = ans.substring(ansSize-2,ansSize); //뒤에 2개만 뽑기
		System.out.println(ans2);
	}
}