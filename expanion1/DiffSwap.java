package expanion1;

public class DiffSwap {
	public static void printNumber(Node n2)
    {
    	while(n2.nextNode != null)
		{
			System.out.print(n2.nodeValue+"->");
			n2 = n2.nextNode;
		}
		System.out.println(n2.nodeValue+"->null");
    }
	public static Node CreateNumber(int n)
	 {
		Node head = null,temp = null,temp1 = null;
		 if(n<=0)
		 {
			 return null;
			 
		 }
		 else
		 {
			 String s = Integer.toString(n);
			 for(int i=0;i<s.length();i++)
			 {
				if(head==null)
				{
					head = new Node((int)s.charAt(i)-48);
					temp = head;
				}
				else
				{
					temp1 = new Node((int)s.charAt(i)-48);
					temp.nextNode = temp1;
					temp1.prevNode = temp;
					temp = temp1;
				}
			 }
			 return head;
		 }
	 }
	public static Node differSwap(Node head)
	{
		try{
			int count =0;
			Node temp = head;
			Node tail2 = null;
			while(temp != null)
			{
				count++;
				tail2 = temp;
				temp = temp.nextNode;
			}
			temp = tail2;
			int total = count;
			count =count/2;
			for(int i=count-1;i>0;i--)
				temp = temp.prevNode;
			Node head2 = temp;
			System.out.println(head2.nodeValue);
			Node head1 = head;
			temp = head;
			for(int i=1;i<count;i++)
				temp = temp.nextNode;
			Node tail1 = temp;
			Node mid = temp.nextNode;
			
		if(total%2==1)
		{
			head2.prevNode = null;
			tail2.nextNode = mid;
			mid.prevNode = tail2;
			mid.nextNode = head1;
			head1.prevNode = mid;
			tail1.nextNode = null;
		}
		else
		{
			head2.prevNode = null;
			tail2.nextNode = head1;
			head1.prevNode = tail2;
			tail1.nextNode = null;
		}
			return head2;
		}
		catch(Exception e)
		{
			Node.printNumber(head);;
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String [] args)
	{
		Node num = CreateNumber(1234567);
		Node.printNumber(num);
		Node ans = differSwap(num);
		Node.printNumber(ans);
	}
}
