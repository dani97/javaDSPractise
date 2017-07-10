package trial;

import java.util.Scanner;

public class FlipBits {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result = a^b;
		System.out.println(Integer.bitCount(result));
				
	}
}
