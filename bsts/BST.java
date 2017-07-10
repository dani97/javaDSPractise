package bsts;

public class BST {
	public Node root;
	BST(){
		this.root = null;
	}

	public void insert(int data){
		Node n = new Node(data);
		if(this.root == null){
			root = n;
		}
		else{
			Node temp = this.root;
			while(temp!=null){
				if(temp.data>=data){
					if(temp.left==null){
						temp.left = n;
						break;
					}
					else{
						temp = temp.left;
					}
				}
				else{
					if(temp.right==null){
						temp.right = n;
						break;
					}
					else{
						temp = temp.right;
					}
				}
			}
		}

	}
	public void display() {
		final int height = 5, width = 32;

		int len = width * height * 2 + 2;
		StringBuilder sb = new StringBuilder(len);
		for (int i = 1; i <= len; i++)
			sb.append(i < len - 2 && i % width == 0 ? "\n" : ' ');

		displayR(sb, width / 2, 1, width / 4, width, root, " ");
		System.out.println(sb);
	}

	private void displayR(StringBuilder sb, int c, int r, int d, int w, Node n,
			String edge) {
		if (n != null) {
			displayR(sb, c - d, r + 2, d / 2, w, n.left, " /");

			String s = String.valueOf(n.data);
			int idx1 = r * w + c - (s.length() + 1) / 2;
			int idx2 = idx1 + s.length();
			int idx3 = idx1 - w;
			if (idx2 < sb.length())
				sb.replace(idx1, idx2, s).replace(idx3, idx3 + 2, edge);

			displayR(sb, c + d, r + 2, d / 2, w, n.right, "\\ ");
		}
	}
}

