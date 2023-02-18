import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static String str1 = "\"재귀함수가 뭔가요?\"";
	static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
	static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
	static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
	static String str5 = "라고 답변하였지.";
	
	
	static String ans = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
	
	public static void main(String[] args) {
		int k = input();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		what(k, 0);//라고 답변했지 이전까지 출력 함수
		ending(k);//라고 답변했지 함수
	}
	
	public static int what(int inputNum, int one) {//라고 답변했지 이전까지 출력 함수
		if (one == inputNum) {
			for(int i =0; i<inputNum*4;i++) {
				System.out.print('_');
			}
			 System.out.println(str1);
			 for(int i =0; i<inputNum*4;i++) {
					System.out.print('_');
				}
			 System.out.println(ans);
			 return 1 ;
		}else {
			for(int i =0; i<one*4;i++) {
				System.out.print('_');
			}
			System.out.println(str1);
			
			for(int i =0; i<one*4;i++) {
				System.out.print('_');
			}
			System.out.println(str2);

			for(int i =0; i<one*4;i++) {
				System.out.print('_');
			}
			System.out.println(str3);

			for(int i =0; i<one*4;i++) {
				System.out.print('_');
			}
			System.out.println(str4);
			one++;
			return what(inputNum, one);
		}	
	}
	
	public static int ending(int inputNum) {//라고 답변했지 함수
		if (inputNum==0) {
			 System.out.println(str5);
			 return 1 ;
		}else {
			for(int i =0; i<inputNum*4;i++) {
				System.out.print('_');
			}
			System.out.println(str5);
			inputNum--;
			return ending(inputNum);
		}	
	}
	
	public static int input() {//인풋 함수
		int k = sc.nextInt();
		return k;
	}
}