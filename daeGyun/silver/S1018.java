import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt(); //입력 배열을 행
		int c = sc.nextInt(); //입력 배열을 열
		char [][] arr = new char[r][c]; //입력배열 크기
		
		//배열 입력 받기
		for(int i = 0; i<r;i++) {
			String kk = sc.next();
			for (int j = 0; j<c;j++) {
				arr[i][j] = kk.charAt(j);
			}
		}
		
		char [][] arr2 = new char[8][8]; //비교할 8*8 배열 생성
		//블랙으로시작 화이트로 시작 2가지 모두를 비교할 예정
		int minN1 = 2500; //최솟값
		int minN2 = 2500;//최솟값
		char [][] arrB = {{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}};
		
		char [][] arrW = {{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}
		,{'W','B','W','B','W','B','W','B'}
		,{'B','W','B','W','B','W','B','W'}};
		

		
		for(int i = 0; i<r;i++) {
			//System.out.println("i실행"+i);
			for (int j = 0; j<c;j++) {
				//System.out.println("j실행"+j+c);
				if((i+8<=r) && (j+8<=c) ) { //여기가 왜 안먹히지...? 해결
					//비교할 8*8 행렬이 본랭렬의 범위를 넘어가면 안됨
					for(int ii = i, rr = 0; ii<i+8; ii++) {
						//System.out.println("ii실행"+ii);
						for(int jj = j, cc =0; jj<j+8; jj++) {
							//System.out.println("jj실행"+jj);
							arr2[rr][cc] = arr[ii][jj]; //arr[i][j]를 시작으로 8*8헹렬 생성
							cc++;
						}
						rr++;
					}
					
					int ans1 = 0;
					int ans2 = 0;
					//생성된 행렬을 블랙으로 시작하는 행렬과 비교
					for(int x = 0; x<8 ; x++) {
						for(int y = 0; y<8; y++) {
							if(arr2[x][y] != arrB[x][y]) {
								ans1 ++;
							}
						}
					}
					if(ans1<minN1) {
						minN1 = ans1;
					}
					
					//생성된 행렬을 화이트로 시작하는 행렬과 비교
					for(int x = 0; x<8 ; x++) {
						for(int y = 0; y<8; y++) {
							if(arr2[x][y] != arrW[x][y]) {
								ans2 ++;
							}		
						}
					}
					
					if(ans2<minN2) {
						minN2 = ans2;
					}
					
				}
			}
		}
		if (minN1>minN2) { //2개의 값을 비교해서 더 낮은 값 추출
			System.out.println(minN2);
		}else System.out.println(minN1);
		//지금 예제4가 인돌아감 해결
		
		
	}
}
