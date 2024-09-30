package generics;

public class Main {
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
