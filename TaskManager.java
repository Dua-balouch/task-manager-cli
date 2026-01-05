import java.util.ArrayList;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // Initial test
        addTask("Learn Git Desktop");
        showTasks();
    }

    public static void addTask(String task) {
        if(task == null || task.isEmpty()) {
            System.out.println("Task cannot be empty");
        } else {
            tasks.add(task);
            System.out.println("Task added successfully: " + task);
        }
    }

    public static void showTasks() {
        System.out.println("All Tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
