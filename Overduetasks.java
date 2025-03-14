import java.util.ArrayList;
import java.util.List;

public class Overduetasks {
    public static void retrieveOverdueTasks(List<Task> tasks){
            List<Task> overdue = new ArrayList<>();
            for(Task task:tasks){
                  if(task.isOverdue()){
                        overdue.add(task);
                  }
            }
            if (overdue.isEmpty()) {
                  System.out.println("No Overdue Tasks Found!");
            } 
            else {
                  System.out.println("Overdue Tasks:");
                  for (Task task : overdue) {
                      System.out.println(task);
                  }
            }
      }
}
