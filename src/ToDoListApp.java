import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Remove Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added: " + task);
                    break;
                case 2:
                    System.out.print("Enter the task to mark as completed: ");
                    String completedTask = scanner.nextLine();
                    if (tasks.contains(completedTask)) {
                        tasks.remove(completedTask);
                        System.out.println("Task marked as completed: " + completedTask);
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the task to remove: ");
                    String removedTask = scanner.nextLine();
                    if (tasks.contains(removedTask)) {
                        tasks.remove(removedTask);
                        System.out.println("Task removed: " + removedTask);
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;
                case 4:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
