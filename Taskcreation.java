import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Taskcreation {
    private static final Scanner sc = new Scanner(System.in);
    private static int taskid = 1;
    public static void addTasks(List<Task> tasks){
              System.out.println("Enter Task Description:");
              String description = sc.nextLine();

              if (description == null || description.trim().isEmpty()) {
                  System.out.println("Task Description cannot be empty!");
                  return;
              }

              System.out.println("Enter Due Date (YYYY-MM-DD HH:MM) or enter for no deadline:");
              String duedateinput = sc.nextLine();
              LocalDateTime duedate = duedateinput.isEmpty()? null:LocalDateTime.parse(duedateinput.replace(" ", "T"));

              tasks.add(new Task(taskid++,description,duedate));
              System.out.println("Task added Successfully");

 
    }
    
}
