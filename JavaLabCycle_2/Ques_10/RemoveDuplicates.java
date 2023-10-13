/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_10;

/**
 *
 * @author HP
 */
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static String[] removeDuplicates(String[] inputArray) {
        
        TreeSet<String> uniqueElements = new TreeSet<>(Arrays.asList(inputArray));

      
        return uniqueElements.toArray(new String[0]);
    }
}
