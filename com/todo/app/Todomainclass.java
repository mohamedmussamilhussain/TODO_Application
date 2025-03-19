package com.todo.app;

import com.todo.taskmanager.CompletedTasks;
import com.todo.taskmanager.OverdueTasks;
import com.todo.taskmanager.Task;
import com.todo.taskmanager.TaskCompleted;
import com.todo.taskmanager.TaskCreation;
import com.todo.taskmanager.TaskDisplay;
import com.todo.taskmanager.UpcomingTasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todomainclass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        while ( true ) {
            
            System.out.println("TODO LIST");
            System.out.println("1.Task Creation");
            System.out.println("2.Mark Task As Completed");
            System.out.println("3.Display All Tasks");
            System.out.println("4.Retrieve Overdue Tasks");
            System.out.println("5.Display Upcoming Tasks");
            System.out.println("6.Display Completed Tasks");
            System.out.println("7.Exit");
            System.out.println("Enter the choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            if ( choice==7 ) {
                 System.out.println("Exited!");
                 break;
            }
             
            switch ( choice ) {
                case 1:
                      TaskCreation.addTasks( tasks );
                      break;
                case 2:
                      System.out.println("Enter Task ID to mark as completed:");
                      int id = sc.nextInt();
                      sc.nextLine();
                      TaskCompleted taskCompleted = new TaskCompleted();
                      taskCompleted.findTaskById( id, tasks );
                      break;    
                case 3:
                      TaskDisplay display = new TaskDisplay( tasks );
                      display.getTasks();
                      break;  
                case 4:
                      OverdueTasks overdue = new OverdueTasks();
                      overdue.retrieveOverdueTasks( tasks );
                      break; 
                case 5:
                      UpcomingTasks upcoming = new UpcomingTasks();
                      upcoming.displayUpcomingTasks( tasks );
                      break;
                case 6:
                      CompletedTasks completed = new CompletedTasks();
                      completed.displayCompletedTasks( tasks );
                      break; 
                default:
                      System.out.println("Invalid choice");
                      break;  
            }          
        }
        sc.close();
    }
}