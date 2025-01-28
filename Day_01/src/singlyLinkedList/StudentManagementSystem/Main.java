package singlyLinkedList.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList students = new StudentLinkedList();

        // Adding student records
        students.addAtEnd(101, "Alice", 20, 'A');
        students.addAtEnd(102, "Bob", 22, 'B');
        students.addAtBeginning(103, "Charlie", 19, 'A');

        // Display all student records
        System.out.println("All student records:");
        students.displayAll();

        // Update grade
        students.updateGrade(102, 'A');

        // Display all student records after update
        System.out.println("\nAfter updating grade:");
        students.displayAll();

        // Delete a student record
        students.deleteByRollNumber(101);

        // Display all student records after deletion
        System.out.println("\nAfter deletion:");
        students.displayAll();

        // Search for a student record
        StudentLinkedList.Student student = students.searchByRollNumber(103);
        if (student != null) {
            System.out.println("\nStudent found: Roll Number: " + student.rollNumber + ", Name: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade);
        } else {
            System.out.println("\nStudent not found");
        }
    }

}
