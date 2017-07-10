package expanion;

public class DeleteLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bin = new BST();
		bin.insert(5);
		bin.insert(3);
		bin.insert(7);
		bin.insert(2);
		bin.insert(4);
		bin.insert(6);
		bin.insert(8);
		bin.display();
		Node root = bin.root;
		deleteLeaves(root.left,root);
		deleteLeaves(root.right,root);
		bin.display();
	}

	public static void deleteLeaves(Node tree,Node par) {
		// TODO Auto-generated method stub
		try{
			if(tree==null)
				return;
			if(tree.left==null&&tree.right==null)
			{
				if(tree==par.left){
					par.left = null;
				}
				else{
					par.right = null;
				}
				return;
			}
			else{
				if(tree.left!=null)
				{
					deleteLeaves(tree.left,tree);
				}
				if(tree.right!=null)
				{
					deleteLeaves(tree.right,tree);
				}
			}
			return;
		}
		catch(Exception e){
			System.out.println("error");
			return;
		}
	}

}
