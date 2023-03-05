import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int minN = sc.nextInt();//숫자 입력
		int maxN = sc.nextInt();//위치 입력
		
		List<Integer> list = new ArrayList<>();//빈리스트 생성
		
		int i = 1;
		while (Math.pow(i, 2)< minN) { //작은 숫자보다 큰 완전제곱수의 시작 찾기
			i++;
		}
			
		while(Math.pow(i, 2)<=maxN) {//큰수보다 작은 완전제곱수까지 리스트에 넣기
			list.add((int)(Math.pow(i, 2)));
			i++;
		}
		
		int sumNum = 0;
		
		int [ ] arr = new int[list.size()];
		for (int j = 0; j<list.size();j++) {//리스트를 배열로 이동시켜 합구하기
			arr[j] = list.get(j);
			sumNum = sumNum + arr[j];
		}
		
		Arrays.sort(arr); //출력
		
		if(list.size()!=0) {//합출력
			System.out.println(sumNum);
		}
		
		
		if(list.size()==0) {//가장 작은 수출력
			System.out.println(-1);
		}else System.out.println(arr[0]);
		
		
		
	}
}