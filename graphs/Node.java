package graphs;

public class Node implements Comparable<Node>{
	public int weight;
	public int toNode;
	Node(int weight,int toNode){
		this.weight = weight;
		this.toNode = toNode;
	}
	@Override
	public int compareTo(Node a) {
		// TODO Auto-generated method stub
		return Integer.compare(this.weight, a.weight);
	}
}
