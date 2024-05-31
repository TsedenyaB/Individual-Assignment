package linkedList;

public class Search {
     
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
	 
	public boolean searchNode(int key) {
		Node current = head;
		while(current != null) {
			if(current.data == key) {
				return true;
			}
			current = current.next;
			
		}
	      return false;
	}
	
	public static void main(String[] args) {
  		Search list = new Search();
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
  		System.out.println(list.searchNode(45));
  		
      }
	
	
	

}
