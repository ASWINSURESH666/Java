/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_3;

/**
 *
 * @author HP
 */
public class PascalTriangle {
    private final int numRows;

    public PascalTriangle(int numRows) {
        this.numRows = numRows;
    }

    public void printTriangle() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  "); // Print spaces for formatting
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", value);
                value = value * (i - j) / (j + 1);
            }

            System.out.println(); // Move to the next line
        }
    }
}