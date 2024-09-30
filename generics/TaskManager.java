package generics;

import java.util.LinkedList;
import java.util.Queue;


// TaskManager with FIFO Queue
public class TaskManager<T extends Task> {
    private Queue<T> taskQueue;

    public TaskManager() {
        taskQueue = new LinkedList<>();
    }

    // Add a task to the queue
    public void addTask(T task) {
        System.out.println("Adding task to the queue: " + task.getName());
        taskQueue.offer(task);  // FIFO queue behavior
    }

    // Process tasks in the queue (FIFO order)
    public void processTasks() {
        while (!taskQueue.isEmpty()) {
            T task = taskQueue.poll();
            task.execute();
        }
    }
}
