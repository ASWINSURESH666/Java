/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_10;

import java.util.Arrays;
import java.util.TreeSet;


/**
 *
 * @author HP
 */


public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "cherry", "banana", "date", "apple"};

        System.out.println("Original Array: " + Arrays.toString(inputArray));

       
        RemoveDuplicates remover = new RemoveDuplicates();
        
      
        String[] resultArray = remover.removeDuplicates(inputArray); 

        System.out.println("Array with Duplicates Removed: " + Arrays.toString(resultArray));
    }
}
