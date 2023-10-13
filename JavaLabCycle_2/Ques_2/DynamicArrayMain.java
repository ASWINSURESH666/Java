/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_2;

/**
 *
 * @author HP
 */
public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.addElement(10);
        dynamicArray.addElement(20);
        dynamicArray.addElement(30);
        dynamicArray.addElement(40);
        dynamicArray.addElement(50);

        dynamicArray.printArray();

        dynamicArray.addElement(25, 2); // Add 25 at position 2
        dynamicArray.printArray();

        dynamicArray.removeElement(3); // Remove element at position 3
        dynamicArray.printArray();

        int elementToSearch = 20;
        int index = dynamicArray.searchElement(elementToSearch);
        if (index != -1) {
            System.out.println(elementToSearch + " found at position " + index);
        } else {
            System.out.println(elementToSearch + " not found in the array.");
        }
    }
}