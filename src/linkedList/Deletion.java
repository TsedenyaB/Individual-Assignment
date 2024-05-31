package linkedList;

public class Deletion {
	
    private Node head;
	
	private static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			this.data = value;
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
	
      public void deleteAtPosition(int position) {
		
		if(position == 1) {
			head = head.next;
		}
		Node current = head;
		Node previous = null;
		int count = 1;
		while(count < position) {
			previous = current;
			current = current.next;
			count++;
		}
		previous.next = current.next;
		current = previous.next;
		
	}
      public static void main(String[] args) {
  		Deletion list = new Deletion();
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
  		list.deleteAtPosition(3);
  		list.display();
      }

}
