package circularLinkedList.TaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks
        scheduler.addTaskAtEnd(1, "Task A", 1, "2025-01-31");
        scheduler.addTaskAtBeginning(2, "Task B", 2, "2025-02-01");
        scheduler.addTaskAtPosition(3, "Task C", 3, "2025-02-05", 1);

        // Display all tasks
        scheduler.displayAllTasks();

        // View current task and move to the next
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        // Search for tasks by priority
        scheduler.searchByPriority(2);

        // Remove a task
        scheduler.removeTaskById(1);

        // Display all tasks again
        scheduler.displayAllTasks();
    }
}
