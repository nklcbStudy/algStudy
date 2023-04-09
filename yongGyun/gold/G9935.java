import java.util.Scanner;

public class G9935 {
	static Scanner sc = new Scanner(System.in);
	static String a; // 전체 문자열
	static String b; // 폭발 문자열

	public static void main(String[] args) {
		a = sc.next();
		b = sc.next();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < a.length(); i++) { // a문자열의 끝까지 확인
			if (a.charAt(i) == b.charAt(b.length() - 1)) { //1번 문자열 a의 i번째 인덱스와 문자열 b의 마지막 글자가 같다면
				int k;
				if (ans.length() + 1 >= b.length()) { //2번 누적된 ans의 길이 + 1이 b의 길이 이상이면(b의 마지막 글자를 아직 넣어주지 않았기 때문)
					for (k = 0; k < b.length() - 1; k++) { //ans와 b를 뒤에서부터 비교하다가 다르면 멈춘다
						if (ans.charAt(ans.length() - 1 - k) != b.charAt(b.length() - 2 - k)) {
							break;
						}
					}
					if (k == b.length() - 1) { //3번 만약 for문이 멈추지 않고 다 돌았다면
						for (int j = 0; j < b.length() - 1; j++) {
							ans.deleteCharAt(ans.length() - 1); // 뒤에서부터 b의 길이 - 1만큼 문자열 폭발
						}
					}
					else {
						ans.append(a.charAt(i)); // 3번이 아니라면 ans에 추가
					}
				}
				else {
					ans.append(a.charAt(i)); // 2번이 아니라면 ans에 추가
				}
			}
			else {
				ans.append(a.charAt(i)); // 1번이 아니라면 ans에 추가
			}
		}
		if(ans.length() == 0) { // ans의 길이가 0이면 모두 폭발했다는 뜻
			System.out.println("FRULA");
		}
		else { // 0이 아니면 ans 출력
			System.out.println(ans);			
		}
	}
}