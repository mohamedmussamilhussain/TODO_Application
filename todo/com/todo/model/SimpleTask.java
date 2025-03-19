package com.todo.model;
import java.time.LocalDateTime;

public class SimpleTask implements Task{
    private final int id;
    private final String description;
    private final LocalDateTime dueDate;
    private boolean isCompleted;
       
      
    public SimpleTask( int id , String description , LocalDateTime dueDate ) {
      this.id=id;
      this.description=description;
      this.dueDate=dueDate;
      this.isCompleted=false;
    }

    @Override
    public int getId() {
      return id;
    }

    @Override
    public String getDescription() {
      return description;
    }

    @Override
    public LocalDateTime getLocalDateTime() {
      return dueDate;
    }

    @Override
    public void markTaskAsCompleted() {
      isCompleted=true;
    }

    @Override
    public boolean isCompleted() {
      return isCompleted;
    }

    @Override
    public boolean isOverdue() {
      return dueDate != null && LocalDateTime.now().isAfter(dueDate) && !isCompleted;
    } 

    @Override
    public boolean isUpcoming() {
      return (dueDate != null && LocalDateTime.now().isBefore(dueDate) && !isCompleted) || (dueDate==null && !isCompleted);
    }

    @Override
    public String toString() {
      return "Task : " +  description + " | Task ID : " + id + "  | Due : " + (dueDate!=null?dueDate:"No DeadLine") + " | " + "Category : " + (isCompleted? "COMPLETED" :(isOverdue()? "OVERDUE" : "UPCOMING"));
    }
}
