package expanion1;

public class AddNumList {
	 public static Node SumOfTwoLists(Node node1, Node node2) 
	    {
	if(node1==null&&node2==null) return null;
    Node ans=null,cur=null;
    //node1 = reverseNumber(node1);
    //node2 = reverseNumber(node2);
    int sum=0,carry=0;
    while(node1!=null && node2!=null)
    {
        Node temp=new Node();
        sum= node1.nodeValue+node2.nodeValue+carry;
        temp.nextNode = null;
        temp.nodeValue=sum%10;
        carry = sum/10;
        node1=node1.nextNode;
        node2=node2.nextNode;
        if(ans == null)
        {
        	ans = cur=temp;
        }
        else
        {
        	cur.nextNode=temp;
            cur=cur.nextNode;
        }
    }
    while(node1!=null&&node2==null)
    {
        Node temp=new Node();
        sum = node1.nodeValue+carry;
        temp.nextNode = null;
        temp.nodeValue=sum%10;
        carry = sum/10;
        if(ans==null)
        {
            ans=cur=temp;
        }
        else
        {
            cur.nextNode=temp;
            cur=cur.nextNode;
        }
        node1=node1.nextNode;
        
    }
     while(node2!=null&&node1==null)
    {
        Node temp=new Node();
        sum = node2.nodeValue+carry;
        temp.nextNode = null;
         temp.nodeValue=sum%10;
        carry = sum/10;
        if(ans==null)
        {
            ans=cur=temp;
        }
        else
        {
            cur.nextNode=temp;
            cur=cur.nextNode;
        }
        node2=node2.nextNode;
    }
    if(carry>0)
    {
        Node temp=new Node();
        temp.nextNode = null;
        temp.nodeValue = carry;
        cur.nextNode = temp;
    }
    return ans;
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
	public static Node reverseNumber(Node head)
	{
		Node prev = null,curr = head,temp = null;
		while(curr.nextNode!=null)
		{
			temp =curr.nextNode;
			curr.nextNode = prev;
			prev = curr;
			curr = temp;
		}
		curr.nextNode = prev;
		return curr;
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n =CreateNumber(1357);
		n = reverseNumber(n);
		Node.printNumber(n);
		Node n2 = CreateNumber(2468);
		n2 = reverseNumber(n2);
		Node.printNumber(n2);
		Node ans = SumOfTwoLists(n,n2);
		Node.printNumber(ans);
		
	}

}
