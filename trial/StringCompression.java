package trial;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringBuilder sb =new StringBuilder();
		int i=0,count =1;
		while(i<str.length()-1){
			if(str.charAt(i)!=str.charAt(i+1)){
				sb.append(str.charAt(i));
				sb.append(count);
				count = 1;
			}
			else{
				count+=1;
			}
			i+=1;
		}
		sb.append(str.charAt(str.length()-1));
		if(str.charAt(str.length()-1)==str.charAt(str.length()-2)){
			sb.append(count);
		}
		else{
			sb.append(1);
		}
		if(sb.length()<str.length())
			System.out.println(sb.toString());
		else
			System.out.println(str);

	}

}
