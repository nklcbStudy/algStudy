import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timeN = sc.nextInt(); //반복 횟수받기
		
		List<Integer> list = new ArrayList<>();//삼각수 리스트
		List<Integer> list2 = new ArrayList<>();//삼각수 3개의 합리스트
		int tri = 0;//삼각수 단일값
		
		for(int i = 1 ; tri<=1000;i++) {//삼각수 리스트에 삼가수 넣기
			tri = i*(i+1)/2;
			list.add(tri);
		}
		
		//3개의 삼각수 합 리스트에 넣기
		for(int i = 0; i< list.size()-2;i++) {
			for(int j = 0; j< list.size()-1;j++) {
				for(int k = 0; k< list.size();k++) {
					list2.add(list.get(i)+list.get(j)+list.get(k));
				}
			}
		}
		
		
		//입력받은 수가 삼각수 리스트 안에 있나 확인
		for (int i =0; i<timeN; i++) {
			int cnt = 0;//없으면 0그대로 전달
			int a = sc.nextInt();
			for(int j = 0; j<list2.size();j++) {
				if(list2.get(j)==a) {
					System.out.println(1);
					cnt++;//있으며 1올려주고 탈출
					break;
				}
				
			}
			if (cnt == 0) {//0이면 리스트 안에 없는 거니
				System.out.println(0);
			}
		}
		
	}

}