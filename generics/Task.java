package generics;

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
