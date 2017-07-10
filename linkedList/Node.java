package linkedList;

import java.util.Scanner;

public class Node {
	public int data;
	public Node next;
	Node(int value){
		this.data = value;
		this.next = null;
	}
	public static Node deleteNode(Node temp1, Node temp2) {
		// TODO Auto-generated method stub
		temp2.next = temp1.next;
		return temp2.next;
	}
	public static Node createList(){
		Scanner sc = new Scanner(System.in);
		Node head=null,temp=null;
		System.out.println("Enter number of nodes");
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				if(head==null){
					head= new Node(sc.nextInt());
					temp= head;
				}
				else{
					temp.next = new Node(sc.nextInt());
					temp = temp.next;
				}
			}
	
		sc.close();
		return head;
	}
	public static void print(Node head) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp.next!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
