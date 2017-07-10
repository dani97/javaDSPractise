package linkedList;


import java.util.HashSet;

public class RemoveDups {
	public static Node withDS(Node head){
		HashSet<Integer> hm = new HashSet<Integer>();
		hm.add(head.data);
		Node temp1 = head.next;
		Node temp2 = head;
		while(temp1!=null){
			if(hm.contains(temp1.data)){
				temp1 = Node.deleteNode(temp1, temp2);
			}
			else{
				hm.add(temp1.data);
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
		}
		return head;
	}
	public static Node bookWay1(Node h){
		HashSet<Integer> hm = new HashSet<Integer>();
		Node head = h;
		Node temp1 = null;
		while(head!=null){
				if(hm.contains(head.data)){
					temp1.next = head.next;
				}
				else{
					hm.add(head.data);
					temp1 = head;
				}
			head = head.next;
		}
		return h;
	}
	public static Node withoutDS(Node head){
		Node current  = head;
		while(current!=null){
			if(current.next==null)
				break;
			Node runner = current.next;
			Node run = current;
			while(runner!=null){
				if(runner.data==current.data){
					runner = Node.deleteNode(runner, run);
				}
				else{
					runner = runner.next;
					run = run.next;
				}
			}
			current = current.next;
		}
		return head;
	}
	public static Node bookWay(Node head){
		Node current =head;
		while(current!=null){
			Node runner = current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Node.createList();
		System.out.println("Before");
		Node.print(head);
		System.out.println("After withDS");
		Node.print(withDS(head));
		System.out.println("After withoutDS");
		Node.print(withoutDS(head));
		System.out.println("After bookWay");
		Node.print(bookWay(head));
		System.out.println("After bookWay1");
		Node.print(bookWay1(head));
	}

}
