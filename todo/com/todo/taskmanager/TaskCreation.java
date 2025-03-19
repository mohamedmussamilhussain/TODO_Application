package com.todo.taskmanager;

import com.todo.model.SimpleTask;
import com.todo.model.Task;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class TaskCreation {
    private static final Scanner sc = new Scanner(System.in);
    private static int taskid = 1;

    public static void addTasks( List<Task> tasks ) {
        System.out.println("Enter Task Description:");
        String description = sc.nextLine();

        if ( description == null || description.trim().isEmpty() ) {
            System.out.println("Task Description cannot be empty !!");
            return;
        }

        System.out.println("Enter Due Date (YYYY-MM-DD HH:MM) or press enter for no deadline:");
        String dueDateInput = sc.nextLine();
        LocalDateTime dueDate = dueDateInput.isEmpty()? null:LocalDateTime.parse(dueDateInput.replace(" ", "T"));

        tasks.add(new SimpleTask( taskid++ , description , dueDate ));
        System.out.println("Task added Successfully");
    }
}
