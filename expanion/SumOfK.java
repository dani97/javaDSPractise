package expanion;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfK {
	private static ArrayList<Integer> a; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new ArrayList<Integer>();
		BST bin = new BST();
		bin.insert(5);
		bin.insert(3);
		bin.insert(7);
		bin.insert(2);
		bin.insert(4);
		bin.insert(6);
		bin.insert(8);
		Node root = bin.root;
		int k = 3;
		int sum = 0;
		Dfs(root);
		Collections.sort(a);
		Collections.reverse(a);
		for(int i=0;i<k;i++){
			sum+=a.get(i);
		}
		System.out.println(sum);
	}
	private static void Dfs(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		Dfs(root.left);
		Dfs(root.right);
		a.add(root.data);
		
	}
}
