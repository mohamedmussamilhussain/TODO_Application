import java.time.LocalDateTime;

public class Task {
     
      public static final String COMPLETED = "Completed";
      public static final String OVERDUE = "Overdue";
      public static final String UPCOMING = "Upcoming";


      public int id;
      String description;
      LocalDateTime duedate;
      boolean isCompleted;

      public Task(int id,String description,LocalDateTime duedate){

            this.id=id;
            this.description=description;
            this.duedate=duedate;
            this.isCompleted=false;
      }
      

      public void markTaskAsCompleted(){
            isCompleted=true;
      }

      public boolean isCompleted(){
            return isCompleted;
      }

      public boolean isOverdue(){
            return duedate != null && LocalDateTime.now().isAfter(duedate) && !isCompleted;
      } 

      public boolean isUpcoming(){
            return (duedate != null && LocalDateTime.now().isBefore(duedate) && !isCompleted) || (duedate==null && !isCompleted);
      }

      @Override
      public String toString(){
            return "Task : " +  description + " | Task ID : " + id + "  | Due : " + (duedate!=null?duedate:"No DeadLine") + " | " + "Category : " + (isCompleted? COMPLETED :(isOverdue()? OVERDUE : UPCOMING));
      }

}
