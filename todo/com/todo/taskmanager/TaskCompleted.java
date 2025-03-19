package com.todo.taskmanager;

import com.todo.model.Task;
import java.util.List;

public class TaskCompleted {
    public void findTaskById( int id , List<Task> tasks ) {
        for ( Task task : tasks ) {
            if ( task.getId() == id ) {
                task.markTaskAsCompleted(); 
                System.out.println( "Task " + id + " marked as completed." );
                return;
            }
        }
        System.out.println( "Task with ID " + id + " not found." );
    }
}

