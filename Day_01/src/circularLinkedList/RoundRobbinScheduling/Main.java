package circularLinkedList.RoundRobbinScheduling;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduling scheduler = new RoundRobinScheduling();

        // Adding processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        // Display all processes
        scheduler.displayProcesses();

        // Simulate round-robin scheduling
        scheduler.roundRobinScheduling(4);

        // Remove a process
        scheduler.removeProcess(2);

        // Display remaining processes
        scheduler.displayProcesses();
    }
}