package com.todo.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class OverdueTasks {
    private final  List<Task> overdue = new ArrayList<>();
    
    public  void retrieveOverdueTasks( List<Task> tasks ) {
    for ( Task task : tasks ) {
        if ( task.isOverdue() ) {
            overdue.add( task );
        }
    }

    if ( overdue.isEmpty() ) {
        System.out.println("No Overdue Tasks Found!" );
    }

    else {
        System.out.println("Overdue Tasks:" );
            for ( Task task : overdue ) {
                System.out.println( task );
            }
        }
    }
}
