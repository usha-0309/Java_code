import java.util.ArrayList;
//Adding an Item in ArrayList

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Do laundry";
    String toDo3 = "Wash the dishes";
    // Add to-dos to toDoList
    toDoList.add(toDo1);
        toDoList.add(toDo2);
    toDoList.add(toDo3);

    
    System.out.println(toDoList);
      
    
  }
  
}