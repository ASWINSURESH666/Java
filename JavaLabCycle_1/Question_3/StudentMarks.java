package QUESTION_3;

import java.util.Scanner;

public class Student {
    private final String name;
    private final int rollNumber;
    private final int[] subjectMarks;
    private int total;

    public Student(String name, int rollNumber, int[] subjectMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectMarks = subjectMarks;
        calculateTotalMarks();
    }

    private void calculateTotalMarks() {
        int sum = 0;
        for (int marks : subjectMarks) {
            sum += marks;
        }
        total = sum;
    }

    public int getTotal() {
        return total;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
    }
}
