package com.todo.taskmanager;

import com.todo.model.Task;
import java.util.List;

public class CompletedTasks {
    
    public  void displayCompletedTasks( List<Task> tasks ) {
        boolean hasCompleted = false;

        System.out.println( "Completed Tasks:" );
        for ( Task task : tasks ) {
            if ( task.isCompleted() ) {
                System.out.println( task );
                hasCompleted = true;
            }
        }

        if ( !hasCompleted ) {
            System.out.println( "No Completed Tasks Found!" );
        }
    }
}
