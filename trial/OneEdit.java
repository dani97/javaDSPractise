package trial;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OneEdit {
	public static HashMap<Character,Integer> convertMap(String str){
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
		return hm;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().toLowerCase();
		String str2 = sc.nextLine().toLowerCase();
		HashMap <Character,Integer>hm1 = convertMap(str1);
		HashMap <Character,Integer>hm2 = convertMap(str2);
		Set<Entry<Character,Integer>> e1 = hm1.entrySet();
		Set<Entry<Character,Integer>> e2 = hm2.entrySet();
		if(e1.equals(e2)){
			System.out.println("True");
		}
		else{
			int diff = 0;
			for(Map.Entry<Character,Integer> m:hm1.entrySet()){  
				char c = m.getKey();
				int t = m.getValue();
				   if(hm2.containsKey(c)){
					   diff += Math.abs(hm2.get(c)-t);
					   hm2.remove(c);
				   }
				   else{
					   diff +=t;
				   }
				}  
			for(Map.Entry<Character,Integer> m:hm2.entrySet()){ 
				diff+=m.getValue();
			}
			if(diff==0||diff==1)
				System.out.println("True");
			else
				System.out.println("False");
		}

		sc.close();
		
	}

}
