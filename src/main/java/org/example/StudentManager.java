package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // Scanner for user input
    private Scanner scanner = new Scanner(System.in);

    // List to store student names
    private List<String> students = new ArrayList<>();

    public void mainMenu() {

        // Loop so menu keeps running
        while (true) {

            System.out.println("\n=== Student Manager ===");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. View all students");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent();
            } else if (choice.equals("2")) {
                removeStudent();
            } else if (choice.equals("3")) {
                viewStudents();
            } else if (choice.equals("4")) {
                System.out.println("Goodbye!");
                break; // exits loop
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void addStudent() {
        // Ask user for name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Add to list
        students.add(name);

        // Confirmation
        System.out.println(name + " added successfully.");
    }

    public void removeStudent() {
        // Ask user for name
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();

        // Check and remove
        if (students.contains(name)) {
            students.remove(name);
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewStudents() {

        // Check if list is empty
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent List:");

        // Loop and print
        for (String student : students) {
            System.out.println(student);
        }
    }
}