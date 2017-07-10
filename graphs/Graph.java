package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public  class Graph {
	private int numNode;
	private ArrayList<LinkedList<Node>> adjList;
	public int source;
	public void createGraph(){
		Scanner sc =  new Scanner(System.in);
		this.numNode = sc.nextInt();
		System.out.println("enter edges");
		int edge = sc.nextInt();
		adjList = new ArrayList<LinkedList<Node>>();
		for(int i=0;i<this.numNode;i++){
			adjList.add(new LinkedList<Node>());
		}
		try{
			for(int i=0;i<edge;i++){
				int src = sc.nextInt()-1;
				int dst = sc.nextInt()-1;
				int weight = sc.nextInt();
				adjList.get(src).add(new Node(weight,dst));
				adjList.get(dst).add(new Node(weight,src));
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("enter Node value between 0 and"+(this.numNode-1));
		}
		this.source = sc.nextInt()-1;
		sc.close();

	}
	public void printGraph(){
		for(int i=0;i<this.numNode;i++){
			Iterator<Node> it = adjList.get(i).iterator();
			System.out.println(i+":\t");
			while(it.hasNext()){
				Node temp = it.next();
				System.out.print(temp.toNode+"("+temp.weight+")  ");
			}
			System.out.println();
		}
	}

	public ArrayList<Node> dijkstra(){
		int start = this.source;
		Node src = new Node(0,start);
		ArrayList<Node> distance = new ArrayList<Node>();
		for(int i=0;i<this.numNode;i++){
			if(i!=start){
				distance.add(new Node(Integer.MAX_VALUE,i));
			}
			else{
				distance.add(src);
			}
		}
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(src);
		while(!pq.isEmpty()){
			Node val = pq.poll();
			LinkedList<Node> temp = this.adjList.get(val.toNode);
			Iterator<Node> it = temp.iterator();
			while(it.hasNext()){
				Node t = it.next();
				if(distance.get(val.toNode).weight+t.weight<distance.get(t.toNode).weight){
					distance.get(t.toNode).weight=distance.get(val.toNode).weight+t.weight;
					pq.add(t);
				}
				
			}
		}
		return distance;
	}


	private int min1(int i, int weight) {
		// TODO Auto-generated method stub
		if(i<0)
			return weight;
		else if(weight<0){
			return i;
		}
		else{
			return Math.min(i, weight);
		}
	}
	public static void main(String [] args){
		Graph graph = new Graph();
		graph.createGraph();
		ArrayList<Node> dist = graph.dijkstra();
        
        for(int i=0; i<graph.numNode; i++){
            if(i!=graph.source){
                System.out.print(((dist.get(i).weight == Integer.MAX_VALUE)?-1:dist.get(i).weight) + " ");
            }
        }
        System.out.println();
	}
}
