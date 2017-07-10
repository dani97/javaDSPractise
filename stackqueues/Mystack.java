package stackqueues;

public class Mystack <T>{
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;

		public  StackNode(T data){
			this.data = data;
			this.next = null;
		}
	}
	private StackNode<T> top;
	
	public T pop(){
		StackNode<T> temp = top;
		top = top.next;
		return temp.data;
	}
	
	public void push(T val){
		StackNode<T> temp = new StackNode<T>(val);
		top.next = temp;
		top = temp;
		
	}
	
	public T peek(){
		if(top==null) return null;
		return top.data;
		
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
}
