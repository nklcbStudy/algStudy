import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static Scanner sc= new Scanner(System.in);
	public static int[] recursion(String s, int l, int r, int cnt){//2개의 값을 반환하기 위해 배열 사용
        if(l >= r) {
        	int [] arr = {1,cnt+1};//if문 들어온 순간도 포함해야 하니 +1
        	return arr;
        }
        else if(s.charAt(l) != s.charAt(r)) {//else if문 들어온 순간도 포함해야 하니 +1
        	int [] arr = {0,cnt+1};
        	return arr;

        }
        else {//여기는 반복이 진행되면 +1
        	cnt++;
        	return recursion(s, l+1, r-1,cnt);
        }
    }
	
    public static int[] isPalindrome(String s){//여기도 2개의 값 반환을 위한 배열생성
        return recursion(s, 0, s.length()-1, 0);//반복횟수를 파악하기 위한 cnt변수 0으로 추가
    }
    
    public static int inputT() {//테스트 케이스 갯수 입력 함수
    	int T = Integer.parseInt(sc.nextLine());
    	return T;
    }
    
    public static String inputS() {//문자열 입력 함수
    	String S = sc.nextLine();
    	return S;
    }
    
    
    public static void main(String[] args){
    	int T = inputT();
    	for(int i = 0; i<T;i++) {
    		String S = inputS();
    		System.out.println(isPalindrome(S)[0]+" "+isPalindrome(S)[1]);//형식대로 출력
        }
    }
}