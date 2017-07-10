package trial;

import java.util.Scanner;

public class StringUnique {
	public static void main(String [] args){
		boolean [] ascii = new boolean[126];
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int i=0;
		for(i=0;i<str.length();i++){
			if(ascii[str.charAt(i)]){
				System.out.println("Not Unique");
				break;
			}
			else{
				ascii[str.charAt(i)]=true;
			}
				
		}
		if(i==str.length()){
			System.out.println("Unique");
		}
	}
}
