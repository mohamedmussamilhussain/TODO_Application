import java.util.ArrayList;
import java.util.List;

public class Taskfiltering {
    public static void  filterTasks(List<Task> tasks){
            List<Task> completedtasks = new ArrayList<>();
            List<Task> upcomingtasks = new ArrayList<>();
            List<Task> overduetasks = new ArrayList<>();
            for(Task task:tasks){
                  if(task.isCompleted()){
                        completedtasks.add(task);
                  }
                  else if(task.isUpcoming()){
                        upcomingtasks.add(task);
                  }
                  else {
                        overduetasks.add(task);
                  }
            }
            
            System.out.println("Upcoming Tasks:");
            displayTasks(upcomingtasks);

            System.out.println("Overdue Tasks:");
            displayTasks(overduetasks);

            System.out.println("Completed Tasks:");
            displayTasks(completedtasks);
      }

      static void displayTasks(List<Task> currenttask ){
            if(currenttask.isEmpty()){
                  System.out.println("No Tasks Found!");
            }
            else {
                  for(Task task:currenttask){
                        System.out.println(task);
                  }
            }
      }
}
