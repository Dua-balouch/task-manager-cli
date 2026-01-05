import java.util.ArrayList;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        addTask("Learn Git Desktop");
        addTask("Learn Java");
        showTasks();

        deleteTask("Learn Java");
        showTasks();
    }

    public static void addTask(String task) {
        if (task == null || task.isEmpty()) {
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

    public static void deleteTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task deleted successfully: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }
}
