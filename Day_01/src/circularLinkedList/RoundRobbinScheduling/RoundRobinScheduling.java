package circularLinkedList.RoundRobbinScheduling;

public class RoundRobinScheduling {
    class Process {
        int processId;
        int burstTime;
        int priority;
        Process next;

        public Process(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.priority = priority;
            this.next = null;
        }
    }

    private Process head;

    public RoundRobinScheduling() {
        this.head = null;
    }

    // Add a process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (prev == null) { // Removing the head
                    if (temp.next == head) { // Only one process in the list
                        head = null;
                    } else {
                        Process last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Process removed: " + processId);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process not found: " + processId);
    }

    // Simulate round-robin scheduling
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        Process temp = head;
        int totalProcesses = countProcesses();
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        System.out.println("Starting Round-Robin Scheduling...");
        while (totalProcesses > 0) {
            if (temp.burstTime > 0) {
                int executionTime = Math.min(temp.burstTime, timeQuantum);
                temp.burstTime -= executionTime;
                System.out.println("Executing Process ID: " + temp.processId + " for " + executionTime + " units.");
                if (temp.burstTime == 0) {
                    System.out.println("Process ID: " + temp.processId + " completed.");
                    totalTurnaroundTime += executionTime;
                    totalProcesses--;
                }
            }
            temp = temp.next;
        }
        double avgWaitingTime = (double) totalWaitingTime / countProcesses();
        double avgTurnaroundTime = (double) totalTurnaroundTime / countProcesses();

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Display all processes in the circular list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the list.");
            return;
        }
        Process temp = head;
        System.out.println("Processes in the list:");
        do {
            System.out.println("Process ID: " + temp.processId + " | Burst Time: " + temp.burstTime + " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Count the total number of processes in the circular list
    private int countProcesses() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
