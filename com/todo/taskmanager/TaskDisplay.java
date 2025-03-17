package com.todo.taskmanager;

import java.util.List;

public class TaskDisplay {
    private List<Task> tasks;

    public TaskDisplay( List<Task> tasks ) {
        this.tasks = tasks;
    }

    public void getTasks() {
        for ( Task task : tasks ) {
            System.out.println( task ); 
        }
    }
}    
