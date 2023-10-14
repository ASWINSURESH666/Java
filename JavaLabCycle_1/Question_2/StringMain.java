/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_2;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of times to repeat the string: ");
            String nStr = scanner.nextLine();
            int n;
            try {
                n = Integer.parseInt(nStr);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.close();
                return;
            }
            System.out.print("Enter the string to be repeated: ");
            String str = scanner.nextLine();
            Strings.repeatString(str, n);
            }
}
}
