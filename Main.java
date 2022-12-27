package TODO;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static todoFunctions myTodoList = new todoFunctions();
    public static void main(String[] args) {
        int command = 0;
        boolean exit = false;
        printCommand();

        while(!exit){
            System.out.println("Enter your command: ");
            command = input.nextInt();
            input.nextLine();

            switch (command) {
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();;
                    break;
                case 4:
                    removeItem();;
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please pick only given command");;
            }
        }   
    }

    public static void printCommand() {
        System.out.println("\n Commands : " +
        "\n press 0 : To print instructions"+
        "\n press 1 : To print all list"+
        "\n press 2 : To add list in ToDo"+
        "\n press 3 : To modify item in ToDo"+
        "\n press 4 : To remove item from ToDo"+
        "\n press 5 : To search an item from ToDo"+
        "\n press 6 : To exit the app"
        );
    }

    public static void addItem(){
        System.out.println("Enter item to be added in todo list : ");
        myTodoList.addItem(input.nextLine());
    }

    public static void updateItem(){
        System.out.println("Enter item's number : ");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("Enter new item to be added : ");
        String myNewItem = input.nextLine();
        myTodoList.updateItem(index-1, myNewItem);
    }

    public static void removeItem(){
        System.out.println("Enter item's number to be deleted : ");
        int index = input.nextInt();
        input.nextLine();
        myTodoList.removeItem(index-1);
    }

    public static void searchItem(){
        System.out.println("Enter item to be searched : ");
        String searchItem = input.nextLine();
        if(myTodoList.searchItem(searchItem) == null){
            System.out.println("Item not found in your ToDo list");
        }else{
            System.out.println(searchItem + " was found in your ToDo list");
        }
    }
}
