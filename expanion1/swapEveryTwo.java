package expanion1;

public class swapEveryTwo {
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
					temp = temp1;
				}
			 }
			 return head;
		 }
	 }
	public static Node swapTwo(Node head)
	{
		try{
			Node temp =null,curr=head,prev = null;
			while(curr.nextNode!=null&&curr!=null)
			{
				temp = curr.nextNode;
				curr.nextNode = curr.nextNode.nextNode;
				
				temp.nextNode = curr;
				
				printNumber(curr);
				if(prev==null)
				{
					head = temp;
					prev = curr;
				}
				else
				{
					prev.nextNode = temp;
					prev= curr;
				}
				curr = curr.nextNode;
				if(curr==null)
					break;
			}
			return head;
		}
		catch(Exception e)
		{
			printNumber(head);
		}
		return null;
	}
	public static void main(String [] args)
	{
		Node n1 = CreateNumber(1234);
		printNumber(n1);
		n1 = swapTwo(n1);
		printNumber(n1);
	}

}
