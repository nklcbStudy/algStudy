import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt(); //배열의 크기(스위치의 갯수)를 입력 받아요
		int [] arr = new int[arrSize]; //입력받은 크기의 배열 생성
		for (int i = 0; i<arrSize; i++) { //배열을 하나씩 받아주세요
			arr[i] = sc.nextInt();
		}
		
		int personNum = sc.nextInt(); //사람수를 입력 받아요
		
		for(int i = 0; i<personNum; i++) {//사람 수만큼 반복해볼게요
			int mOrw = sc.nextInt();// 남자인지 여자인지
			int cardNum = sc.nextInt(); //그사람의 번호도 입력 받아요
			
			if(mOrw ==1) { //자 남자라면
				int a = arrSize/cardNum; //배열안에서 주어진 번호의 배수가 몇개 있을까
				for(int j =1; j<a+1;j++) {
					if(arr[j*cardNum-1]==1) {//해당 배수들이 1이면 0으로
						arr[j*cardNum-1]=0;
					}else {//0이면 1로
						arr[j*cardNum-1]=1;
					}
				}
			}else {//여자라면
				if(cardNum>=(arrSize/2)) {//입력받은 갯수가 스위치 개숫의 반보다 크거나 같다면
					int moving = arrSize-cardNum;//전체크기에서 입력받은 수를 뺴줘요
					for (int j = 1; j<moving+1;j++) {
						if(arr[cardNum-j-1] == arr[cardNum+j-1]&&arr[cardNum-j-1] ==1){ //대칭을 비교해보고
							arr[cardNum-j-1] = 0;
							arr[cardNum+j-1] = 0;
						}else if(arr[cardNum-j-1] == arr[cardNum+j-1]&&arr[cardNum-j-1] ==0){//1이면 0으로 0이면 1로
							arr[cardNum-j-1] = 1;
							arr[cardNum+j-1] = 1;
						}else break;
					}
					
				}else if(cardNum<(arrSize/2)){//입력받은 갯수가 스위치 개숫의 반보다 크거나 작다면
					int moving = cardNum-1; //그냥 해당 수에서 -1만 해줘요
					for (int j = 1; j<moving+1;j++) {
						if(arr[cardNum-j-1] == arr[cardNum+j-1]&&arr[cardNum-j-1] ==1){
							arr[cardNum-j-1] = 0;
							arr[cardNum+j-1] = 0;
						}else if(arr[cardNum-j-1] == arr[cardNum+j-1]&&arr[cardNum-j-1] ==0){
							arr[cardNum-j-1] = 1;
							arr[cardNum+j-1] = 1;
						}else break;
					}
				}
				
				if(arr[cardNum-1]==1) {
					arr[cardNum-1]=0;
				}else arr[cardNum-1]=1;
			}
			
		}
		int cntt = 0; //20개가 넘어가면 줄바꿈 할예정
		
		for(int i =0 ; i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
			cntt++;
			if(cntt %20 == 0 ) {
				System.out.println();
			}
		}
	}

}