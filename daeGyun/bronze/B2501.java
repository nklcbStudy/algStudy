import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();//숫자 입력
		int where = sc.nextInt();//위치 입력
		List<Integer> list = new ArrayList<>();//빈리스트 생성
		
		//약수들만 리스트에 받기
		for(int i = 1; i<num+1 ; i++) {
			if (num%i==0) {
				list.add(i);
			}
		}
		
		//배열만들어서 정리하기
		int [] arr = new int [list.size()];
		for(int i = 0; i<list.size();i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		
		//출력
		if(arr.length<where) {
			System.out.println(0);
		}else System.out.println(arr[where-1]);
		
		
		
	}
}