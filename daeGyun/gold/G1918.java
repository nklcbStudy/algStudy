package Main;

import java.util.Scanner;

//테스트 케이스를 입력받아 반복문을 시작합니다
//N과M을 입력받아 배열과 파리채를 만들고 배열의 요소들도 입력받습니다
//마지막으로 나올 수 있는 모든 경우의수를 다 탐색한 뒤 최댓값을 뽑아보겠습니다

public class SWEA_2001_파리퇴치_박대균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int tc = sc.nextInt(); //테스트 케이스 입력
		 
		 for (int i = 0; i<tc; i++) { //입력받은 케이스 만큼 반복시작
			 int N =sc.nextInt(); // 배열의 크기 입력
			 int M = sc.nextInt();//파리채 크기 입력
			 int[][] arr= new int[N][N]; //입력받은 배열의 크기의 배열 생성
			 
			 for(int j = 0; j<N;j++) { //배열에 값 하나하나 입력 받기
				 for(int k = 0; k<N;k++) {
					arr[j][k] = sc.nextInt(); 
				 }
			 }
			 
			 int maxNum = 0;// 최대값 변수 생성
			 
			 for(int j = 0; j+M<N+1;j++) {//파리채가 배열의 범위를 넘어가지 않도록 설정
				 for(int k = 0; k+M<N+1;k++) {
					int sumNum = 0; //파리체 크기의 값들을 모두 더할 변수
					for(int r = j; r<j+M;r++) {//파리채 크기만큼 반복하며
						for(int c = k; c<k+M ;c++) {
							sumNum =sumNum+arr[r][c]; //해당 값들을 더합니다
						}
					}
					//System.out.println(sumNum);
					if (sumNum>maxNum) {//더한 값이 맥스 넘보다 크다면
						maxNum = sumNum;//그 값을 저장합니다.
					}
				 }
			 }
			 System.out.println("#"+(i+1)+" "+maxNum);
			 
		 }
	}

}
