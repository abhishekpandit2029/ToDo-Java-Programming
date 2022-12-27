package TODO;

import java.util.ArrayList;

public class todoFunctions {

    private ArrayList<String> todoList = new ArrayList<String>();

    // Add list items

    public void addItem(String item){
        todoList.add(item);
    }

    // Remove list items

    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(myItem);
    }

    // print the entire list

    public void printTodoList(){
        System.out.println("ToDO List constist of: " + todoList.size() + " items");

        for(int i=0; i<todoList.size(); i++){
            System.out.println("Item at position " + (i+1) + " is " + todoList.get(i));
        }
    }

    // Update list items

    public void updateItem(int index, String list){
        todoList.set(index, list);
        System.out.println("Updation completed ...");
    }

    // Search list items

    public String searchItem(String item){
        int index = todoList.indexOf(item);
        if(index == -1){
            return null;
        }else{
            return todoList.get(index);
        }
    }

    
}
