package com.todo.taskmanager;

import com.todo.model.Task;
import java.util.List;

public class TaskDisplay {

    public void displayTasks( List<Task> tasks ) {
        if ( tasks.isEmpty() ) {
            System.out.println( "No Tasks Found!" );
            return;
        }

        for ( Task task : tasks ) {
            System.out.println( task );
        }
    }
}    
