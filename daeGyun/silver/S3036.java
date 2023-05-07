import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [ ] nums = new int [N-1];
		int fst = sc.nextInt();
		for(int i = 0; i<N-1;i++) {
			nums[i] = sc.nextInt();
		}
		
		boolean check = false;
		for(int i = 0; i<N-1; i++) {
			int min = Math.min(fst, nums[i]);
			//System.out.println("min = "+min);
			for(int j = min; j>1; j--) {
				if(fst % j == 0 && nums[i] % j ==0) {
					//System.out.println("공약수 = "+j);
					System.out.println((fst/j)+"/"+(nums[i]/j));
					check = true;
					break;
				}
				
			}
			if(!check) {
				System.out.println(fst+"/"+nums[i]);
			}
			check = false;
		}
	}
}