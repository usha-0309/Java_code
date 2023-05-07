import java.util.ArrayList;
// Arrays.list option get ,set, indexOf ,add,remove 
public class ToDom {
    public static void main(String[] args) {
        ArrayList<String> sherlocksToDos = new ArrayList<String>();
        sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    //add items
    System.out.println(sherlocksToDos.add("DONE"));
     //size 
    System.out.println(sherlocksToDos.size()); 
    //get 
    System.out.println(sherlocksToDos.get(2));
    //set
    System.out.println(sherlocksToDos.set(5,"And meet the Criminal"));
    //remove
    System.out.println(sherlocksToDos.remove(0));
    //index Of return index value
    System.out.println(sherlocksToDos.indexOf("solve the case")); 
   
    System.out.println(sherlocksToDos.toString());
}
}