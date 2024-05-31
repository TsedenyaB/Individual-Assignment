package linkedList;

public class Main {
	
	public static void main(String[] args) {
		
		ToDoList toDoList = new ToDoList();

        
        toDoList.addToDo(new Task("Task 1", "Study Applied"));
        toDoList.addToDo(new Task("Task 2", "Study OOP"));
        toDoList.addToDo(new Task("Task 3", "DSA assignment"));

        toDoList.markToDoAsCompleted("Task 2");
        toDoList.viewToDoList();
		
	}

}
