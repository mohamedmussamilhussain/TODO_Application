import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todoapp{

    static List<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       while(true){
            showAvailableOptions();
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==5) break;
            handleChoice(choice);
      }
        
    }

    static void showAvailableOptions(){
        System.out.println("TODO LIST");
        System.out.println("1.Task Creation");
        System.out.println("2.Mark Task As Completed");
        System.out.println("3.Filter Tasks");
        System.out.println("4.Retrieve Overdue Tasks");
        System.out.println("5.Exit");
        System.out.println("Enter the choice: ");
    }

    static void handleChoice(int choice){
        switch(choice){
            case 1:
                  Taskcreation.addTasks(tasks);
                  break;
            case 2:
                  markTaskAsCompleted();
                  break;    
            case 3:
                  Taskfiltering.filterTasks(tasks);
                  break;  
            case 4:
                  Overduetasks.retrieveOverdueTasks(tasks);
                  break;  
            default:
                  System.out.println("Invalid choice");
                  break;          
                
        }
      }

      static void markTaskAsCompleted(){
            System.out.println("Enter Task ID to mark as completed");
            int id = sc.nextInt();
            sc.nextLine();

            Task task = findTaskById(id);
            if (task != null) {
                task.markTaskAsCompleted();
                System.out.println("Task marked as completed.");
            } else {
                System.out.println("Task  Not Found!");
            }
      }

      static Task findTaskById(int id){
            for (Task task : tasks) {
                  if (task.id == id) {
                      return task;
                  }
              }
              return null;
      }
}
