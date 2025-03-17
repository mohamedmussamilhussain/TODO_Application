package com.todo.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class CompletedTasks {
    private final  List<Task> completed  = new ArrayList<>();
    
    public  void displayCompletedTasks( List<Task> tasks ) {
        for ( Task task : tasks ) {
            if ( task.isCompleted() ) {
                completed.add( task );
            }
        }

        if ( completed.isEmpty() ) {
            System.out.println("No Completed Tasks Found!" );
        } 

        else {
            System.out.println("Completed Tasks:" );
                for ( Task task : completed ) {
                    System.out.println( task );
            }
        }
    }
}
