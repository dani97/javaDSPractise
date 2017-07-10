package expanion1;

public class Node {
 
public int nodeValue;
 Node nextNode;
 Node prevNode;
 Node()
 {
	 this.nodeValue = -1;
	 this.nextNode = null;
	 this.prevNode =null;
 }
Node(int n)
{
	this.nodeValue =n;
	this.nextNode = null;
	this.prevNode = null;
}
public static void printNumber(Node n2)
{
	if(n2==null) 
		return;
	while(n2.nextNode != null)
	{
		System.out.print(n2.nodeValue+"->");
		n2 = n2.nextNode;
	}
	System.out.println(n2.nodeValue+"->null");
}
}
