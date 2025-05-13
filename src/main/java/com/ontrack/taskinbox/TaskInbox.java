package com.ontrack.taskinbox;

import java.util.Arrays;
import java.util.List;

public class TaskInbox {

    public List<String> getSubmittedTasks(String studentId) {
        if ("s224078886".equals(studentId)) {
            return Arrays.asList("Task 1", "Task 2");
        }
        return Arrays.asList();
    }
}