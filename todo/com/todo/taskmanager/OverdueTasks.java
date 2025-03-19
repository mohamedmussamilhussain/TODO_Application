package com.todo.taskmanager;

import com.todo.model.Task;
import java.util.List;

public class OverdueTasks {
    
    public  void retrieveOverdueTasks( List<Task> tasks ) {
        boolean hasOverdue = false;

        System.out.println( "Overdue Tasks:" );
        for ( Task task : tasks ) {
            if ( task.isOverdue() ) {
                System.out.println( task );
                hasOverdue = true;
            }
        }

        if ( !hasOverdue ) {
            System.out.println( "No Overdue Tasks Found!" );
        }
    }    
}
