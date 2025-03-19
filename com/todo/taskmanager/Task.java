package com.todo.taskmanager;
import java.time.LocalDateTime;

public interface Task{
    int getId();
    String getDescription();
    LocalDateTime getLocalDateTime();
    void markTaskAsCompleted();
    boolean isCompleted();
    boolean isOverdue();
    boolean isUpcoming();
    String toString();
}
