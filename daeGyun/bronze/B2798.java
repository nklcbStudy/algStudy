import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int card = sc.nextInt();//카드갯수 N
		int num = sc.nextInt();//M
		
		int [] arr = new int[card];//카드를 담을 배열
		
		for (int i = 0; i<card; i++) {//배열에 카드값 채우기
			arr[i] = sc.nextInt();
		}
		
		int size = 1; //더해지는 사이즈 초기값
		int bb = 1;// 최종 사이즈 초기값
		
		//카드 수에 따른 경우의 수 구하기
		for(int i =2; i<card-1;i++) {		
			size = size +i;
			bb = size+bb;
		}
		
		
		//경우의 수만큼의 배열 생성
		int [] arr2 = new int[bb];
		int kk = 0;
		
		//배열에 3가지 조합의 모든 경우의수 넣기
		for(int i = 0 ; i<card-2; i++) {
			for (int j = i+1; j< card-1; j++) {
				for(int z = j+1; z<card; z++) {
					arr2[kk] = arr[i]+arr[j]+arr[z];
					//System.out.print(i);
					//System.out.print(j);
					//System.out.print(z);
					//System.out.println(arr2[kk]);
					kk++;	
				}	
			}
		}
		
		//리스트를 만들어 M이하의 수 담기
		int ans = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<bb; i++) {
			if (num >=arr2[i]) {
				list.add(arr2[i]);
			}
		}
		ans = Collections.max(list);// 가장 큰값 추출
		System.out.println(ans);
		
	}

}