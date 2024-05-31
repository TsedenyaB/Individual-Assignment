package linkedList;

public class Insertion {
	
     private Node head;
	
	     private static class Node{
		     private int data;
		     private Node next;
		
	   public Node(int value){
			this.data = value;
			this.next = null;
		}
	}
	public void insertAtPos(int num, int position) {
		Node newNode = new Node(num);
		if(position == 1) {
		    newNode.next = head;
		    head = newNode;
		}else {
			Node previous = head;
			int count = 1;
			while(count < position-1) {
				previous = previous.next;
				count++;
			}
			
			Node current = previous.next;
			newNode.next = current;
			previous.next = newNode;
					
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
	 
	public static void main(String[] args) {
		Insertion list = new Insertion();
		list.head = new Node(12);
		Node second = new Node(23);
		Node third = new Node(89);
		Node fourth = new Node(20);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		
		list.display();
		list.insertAtPos(56,4);
		list.display();
	}

}
