package generics;

import java.util.LinkedList;
import java.util.Queue;

// Base class for Task
abstract class Task {
    private String name;
    
    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each task will implement its own run logic
    public abstract void execute();
}

// Task: PayInvoiceTask
class PayInvoiceTask extends Task {
    private long invocidId;
    private double invoiceAmount;

    public PayInvoiceTask(long invocidId, double invoiceAmount) {
        super("PAY_INVOICE");
        this.invocidId = invocidId;
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public void execute() {
        System.out.println("Pay Invoice (" + invocidId + ") of " + invoiceAmount + " USD if there is enogh balance");
        System.out.println("Executing task: " + getName() + " - Processing invoice payment.");
    }
}

// Task: PaySalaryTask
class PaySalaryTask extends Task {
    private String employeeId;
    public PaySalaryTask(String employeeId) {
        super("PAY_SALARY");
        this.employeeId = employeeId;
    }

    @Override
    public void execute() {
        System.out.println("Pay Salary for " + employeeId + " if there is enogh balance and it's end of the month");
        System.out.println("Executing task: " + getName() + " - Processing salary payment.");
    }
}

// TaskManager with FIFO Queue
class TaskManager<T extends Task> {
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

public class TaskManagerExample {
    public static void main(String[] args) {
        // Creating TaskManager to handle tasks
        TaskManager<Task> taskManager = new TaskManager<>();

        // Creating specific tasks
        PayInvoiceTask invoiceTask = new PayInvoiceTask(1234L, 1000.0);
        PaySalaryTask jensenSalaryTask = new PaySalaryTask("jensen");
        PaySalaryTask rachelSalaryTask = new PaySalaryTask("rachel");
        PaySalaryTask anastasiiaSalaryTask = new PaySalaryTask("anastasiia");

        // Adding tasks to the task manager's queue
        taskManager.addTask(anastasiiaSalaryTask);
        taskManager.addTask(invoiceTask);
        taskManager.addTask(jensenSalaryTask);
        taskManager.addTask(rachelSalaryTask);

        // Processing the tasks in FIFO order
        taskManager.processTasks();
    }
}