package expanion;

import java.util.HashSet;
import java.util.Iterator;



public class CheckDeadend {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bin = new BST();
		bin.insert(5);
		bin.insert(3);
		bin.insert(7);
		bin.insert(2);
		bin.insert(5);
		bin.insert(6);
		bin.insert(8);
		bin.display();
		Node root = bin.root;
		System.out.println(check(root));
		bin.display();
	}

	private static boolean check(Node root) {
		// TODO Auto-generated method stub
		HashSet<Integer> hm = new HashSet<Integer>();
		HashSet<Integer> leaves = new HashSet<Integer>();
		hashDfs(root,hm,leaves);
		if(hm.contains(1))return true;
		Iterator<Integer> i = leaves.iterator();
		while(i.hasNext()){
			int t = i.next();
			if(hm.contains(t+1)&&hm.contains(t-1)){
				return true;
			}
		}
		return false;
	}

	private static void hashDfs(Node root, HashSet<Integer> hm,HashSet<Integer> leaf) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			leaf.add(root.data);
		hm.add(root.data);
		hashDfs(root.left,hm,leaf);
		hashDfs(root.right,hm,leaf);
		
	}


}
