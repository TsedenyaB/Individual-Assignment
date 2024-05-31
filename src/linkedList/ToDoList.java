package linkedList;

public class ToDoList {
	private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                System.out.println("Task '" + title + "' marked as completed.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task " + title + " not found in the to-do list.");
    }

    public void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("No tasks in your to-do list");
        } else {
            System.out.println("Tasks in your to-do list:");
            while (current != null) {
                Task task = current.getTask();
                System.out.println(" -Title: " + task.getTitle());
                System.out.println("  Description: " + task.getDescription());
                System.out.println("  Completed: " + (task.isCompleted() ? "Yes" : "No"));
                current = current.getNext();
            }
        }
    }

}

class Task {
	
	    private String title;
	    private String description;
	    private boolean completed;

	    public Task(String title, String description) {
	        this.title = title;
	        this.description = description;
	        this.completed = false;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public boolean isCompleted() {
	        return completed;
	    }

	    public void markCompleted() {
	        completed = true;
	    }
	
}

class Node {
    private Task task;
    private Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }

    public Task getTask() {
        return task;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

