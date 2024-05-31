package linkedList;

public class Stack {
	
    private Node top;
	private int length;

	private static class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
  }
	
	public Stack() {
		top = null;
		length = 0;
		
	}
	public int length(){
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException( "Stack is Empty");
		}
		
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty");
		}
		return top.data;
	}
	
    public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(45);
		stack.push(23);
		stack.push(77);
		stack.push(82);
		stack.push(90);
		
		System.out.println(stack.peek());
		stack.pop();
	}

}
