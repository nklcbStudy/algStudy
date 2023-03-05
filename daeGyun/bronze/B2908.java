import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String h = sc.next();
		String m = sc.next();
		

		char fst = h.charAt(0);
		char trd = h.charAt(2);
		h = h.substring(0,0)+trd+h.substring(1);
		h = h.substring(0,2)+h.substring(3)+fst;
		
		char fst2 = m.charAt(0);
		char trd2 = m.charAt(2);	
		m = m.substring(0,0)+trd2+m.substring(1);
		m = m.substring(0,2)+m.substring(3)+fst2;
		
		 int numH = Integer.parseInt(h);
		 int numM = Integer.parseInt(m);
		 
		
		if(numH>numM) {
			System.out.println(numH);
		}else System.out.println(numM);
	}

}