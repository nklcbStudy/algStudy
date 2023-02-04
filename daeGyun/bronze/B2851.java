import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [10]; //수를 담을 배열
		List<Integer> list = new ArrayList<>(); //100근접 수들을 담을 리스트
		
		int ans = 0;
		for (int i =0; i<10;i++) {//10개을 수 입력받아 배열에
			int a= sc.nextInt();
			ans = ans +a;
			arr[i] = ans;
			arr[i] = arr[i]-100;//100까지의 부족한 수치 또는 넘치는 수치로 변경
		}
		
		for(int i =0; i<10; i++) {//수가가 0과 같거나 보다 바로 직전 작은 값까지를 리스트에
			if (arr[i]<=0) {
				list.add(arr[i]);
			}
		}
		
		if(list.get(list.size()-1)==0) {//마지막 값이 0이먄
			System.out.println(100);
		}else if(list.size()==10){//10개 가득 차면 마지막 수 출력
			System.out.println(list.get(9)+100);
		}else {//마지막 값리 음수이면
			list.add(arr[list.size()]);//0보다 큰 단하나의 수를 리스트에 추가
			if(Math.abs(list.get(list.size()-2))<list.get(list.size()-1)) {//끝에 두에 값의 절댓값을 비교
				System.out.println(100 + list.get(list.size()-2));//앞이 작으면 100에서 앞값을 더한것을
			}else {
				System.out.println(100 + list.get(list.size()-1));//뒤가 작거나 같으면 뒤에 값더하기 100을
			}
		}
		
	}

}
