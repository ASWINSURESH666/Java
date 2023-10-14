package QUESTION_3;

import java.util.Scanner;

public class StudentMarksMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter details for Student 1:");
            String name1 = inputName(scanner);
            int rollNumber1 = inputRollNumber(scanner);
            int[] subjectMarks1 = inputSubjectMarks(scanner);
            
            // Consume the newline character
            scanner.nextLine();
            
            System.out.println("Enter details for Student 2:");
            String name2 = inputName(scanner);
            int rollNumber2 = inputRollNumber(scanner);
            int[] subjectMarks2 = inputSubjectMarks(scanner);
            
            Student student1 = new Student(name1, rollNumber1, subjectMarks1);
            Student student2 = new Student(name2, rollNumber2, subjectMarks2);
            
            if (student1.getTotal() > student2.getTotal()) {
                System.out.println("Details of the student with greater total marks:");
                student1.printDetails();
            } else if (student1.getTotal() < student2.getTotal()) {
                System.out.println("Details of the student with greater total marks:");
                student2.printDetails();
            } else {
                System.out.println("Both students have the same total marks.");
            }
        }
    }

    private static String inputName(Scanner scanner) {
        System.out.print("Enter Name: ");
        return scanner.nextLine();
    }

    private static int inputRollNumber(Scanner scanner) {
        System.out.print("Enter Roll Number: ");
        return scanner.nextInt();
    }

    private static int[] inputSubjectMarks(Scanner scanner) {
        int[] marks = new int[5];
        System.out.println("Enter Subject Marks (5 subjects):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " Marks: ");
            marks[i] = scanner.nextInt();
        }
        return marks;
    }
}
