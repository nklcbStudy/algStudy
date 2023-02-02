import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[9];//9난쟁이 배열
		
		for(int i = 0; i<9;i++) {// 9배열 채우기
			arr[i] = sc.nextInt();
		}
		
		//9배열의 합
		int numSum = 0;
		for(int i = 0; i< 9; i++) {
			 numSum = numSum+arr[i];
		}
		
		int numM = 0; //2배열의 합
		int no1 = 0;//가짜난장이1
		int no2 = 0;//가짜난장이2
		
		outerLoop:
		for(int i =0; i<8;i++) {//
			for (int j = i+1; j<9;j++) {//2명씩 짝지을 예정
				numM = arr[i]+arr[j];
				if(numSum-numM==100) {//아까 9명의 합에서 2명을 뻇을때 100이 나온다면?
					no1 = i;		  //잡았다 요놈	
					no2 = j;
					break outerLoop;
				}
			}
		}
		
		int [ ] arr2 = new int[7];//7명 담을 배열
		

		for(int k = 0, i = 0; k < 9; k++) {// 7명 배열 잠기
			if(k==no1) continue;
			else if(k==no2) continue;
			else {
				
				arr2[i] = arr[k];
				i++;
			}
			
		}
		
		Arrays.sort(arr2);//순서대로 절렬
		
		for(int i = 0 ;  i <7;i++) {//출력
			System.out.println(arr2[i]);
		}
	}

}
