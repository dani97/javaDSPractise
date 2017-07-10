package trial;

import java.util.Scanner;

public class URLify {
	public static String  urlify1(String str){
		return 	str.trim().replaceAll("[ ]", "%20");
	}
	
	public static String urlify2(String str){
		char [] stra = str.toCharArray();
		int n = stra.length;
		for(int i=0;i<n;i++){
			if(stra[i]==' '){
				stra[i] = '%';
				int j=n-1;
				while (j>=i+2){
					stra[j] = stra[j-2];
					j--;
				}
				stra[i+1] = '2';
				stra[i+2] = '0';
			}
		}
		return String.valueOf(stra);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(urlify2(str));

	}

}
