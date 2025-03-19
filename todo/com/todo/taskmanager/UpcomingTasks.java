package com.todo.taskmanager;

import com.todo.model.Task;
import java.util.List;

public class UpcomingTasks {

    public  void displayUpcomingTasks( List<Task> tasks ) {
        boolean foundUpcoming = false;

        System.out.println( "Upcoming Tasks:" );
        for ( Task task : tasks ) {
            if ( task.isUpcoming() ) {
                System.out.println( task );
                foundUpcoming = true;
            }
        }

        if ( !foundUpcoming ) {
            System.out.println( "No Upcoming Tasks Found!" );
        }
    }
}
