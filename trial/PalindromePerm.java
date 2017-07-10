package trial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PalindromePerm {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		sc.close();
		Boolean flag = null;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char t = str.charAt(i);
			if(t==' ')
				continue;
			if(!hm.containsKey(t))
				hm.put(str.charAt(i), 1);
			else
				hm.replace(t, hm.get(t)+1);
		}
		Iterator<Integer> i = hm.values().iterator();
		while(i.hasNext()){
			int t= i.next();
			if(t%2!=0 && flag==null){
				flag = new Boolean(true);
			}
			else{
				if(t%2!=0)
				{
					System.out.println("Not Palindrome permutation");
					flag = false;
				break;
				}
			}
		}
		if(flag==null||flag==true){
			System.out.println("Palindrome permutation");
		}
	}
}
