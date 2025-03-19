package com.todo.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class UpcomingTasks {
    private final  List<Task> upcoming = new ArrayList<>();

    public  void displayUpcomingTasks( List<Task> tasks ) {
        for ( Task task : tasks ) {
            if ( task.isUpcoming() ) {
                upcoming.add( task );
            }
        }

        if ( upcoming.isEmpty() ) {
            System.out.println("No Upcoming Tasks Found!" );
        } 

        else {
            System.out.println("Upcoming Tasks:");
            for ( Task task : upcoming ) {
                    System.out.println( task );
            }
        }
    }
}
