package com.ontrack.taskinbox;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TaskInboxTest {

    @Test
    public void testGetSubmittedTasksForStudent() {
        TaskInbox inbox = new TaskInbox();
        List<String> tasks = inbox.getSubmittedTasks("s224078886");
        assertEquals(2, tasks.size());
        assertTrue(tasks.contains("Task 1"));
        assertTrue(tasks.contains("Task 2"));
    }
}