package bsts;

import java.util.Scanner;

public class RotateTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b = new BST();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			b.insert(sc.nextInt());
		}
		sc.close();
		
		b.display();
		mirrorTree(b.root);
		b.display();
	}
