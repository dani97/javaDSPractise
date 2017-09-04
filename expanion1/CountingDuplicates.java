package expanion1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountingDuplicates {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++){
			if(hs.containsKey(arr[i])){
				hs.replace(arr[i], hs.get(arr[i])+1);
			}
			else{
				hs.put(arr[i],1);
			}
		}
		Set<Entry<Integer,Integer>> values = hs.entrySet();
		for(Entry<Integer,Integer> t:values){
			System.out.println(t.getKey()+"occurs "+t.getValue());
		}
		
	}

}
