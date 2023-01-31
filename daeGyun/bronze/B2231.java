import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String numStr = sc.next();//입력값
		int size = numStr.length(); //문자열로 받은 다음 길이 구하기
		int num = Integer.parseInt(numStr);//다시 숫자로
		List<Integer> list = new ArrayList<>();//빈배열 생성
		int ii = 0; //정답 숫자
		
		for(int i = 1; i<num;i++) {//1부터 넘-1까지
			int ans =0;
			for(int j = 0; j<size; j++) {
				int cnt = (int) (i/(1*Math.pow(10, j))); //10의 거듭제곱ㅇ로 나눈 정수 값
				cnt = cnt%10;  //다시 10으로 나눠 나머지들을 출력 및 합
				ans = ans + cnt;
				
			}
			
			list.add(ans+i);
			if (list.get(i-1)==num) { //1부터이니까 같은 값이 나오는 순간 브레이크
				ii = i;
				break;
			}else ii=0;
				
		}
		System.out.println(ii);
		
		
	}
}