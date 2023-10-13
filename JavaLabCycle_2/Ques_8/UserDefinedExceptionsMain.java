/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_8;

/**
 *
 * @author HP
 */
public class UserDefinedExceptionsMain {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 22);
            Student student2 = new Student("Bob", 130);

            System.out.println(student1);
            student1.validateAge();

            System.out.println(student2);
            student2.validateAge();
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}