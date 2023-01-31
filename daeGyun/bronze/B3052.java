import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();		
		int [ ] arr = new int[10];
		
		for(int i = 0; i<10;i++) {
			int k =sc.nextInt();
			k = k%42;
			arr[i] = k;
			set.add(arr[i]);
		}
		
		System.out.println(set.size());
		
		
		
	}
}