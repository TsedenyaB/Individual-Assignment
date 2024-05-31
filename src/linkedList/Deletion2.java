package linkedList;

public class Deletion2 {
	
	private Node head;
	
	private static class Node{
		int data;
		Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	  }
  }
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	 public void deleteNodeAfter(Node givenNode) {
	        if (givenNode != null && givenNode.next != null) {
	            Node nodeToDelete = givenNode.next;
	            givenNode.next = nodeToDelete.next;
	            
	        }
	 }
	 
	 public static void main(String[] args) {
	  		Deletion2 list = new Deletion2();
	  		list.head = new Node(34);
	  		Node second = new Node(12);
	  		Node third = new Node(56);
	  		Node fourth = new Node(90);
	  		Node fifth = new Node(8);
	  		
	  		list.head.next = second;
	  		second.next = third;
	  		third.next = fourth;
	  		fourth.next = fifth;
	  		
	  		list.display();
	  		list.deleteNodeAfter(third);
	  		list.display();
	      }
		

}
