/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_1;

/**
 *
 * @author HP
 */
public class TowerOfHanoi {

    public static void solveTowerOfHanoi(int numDiscs, char source, char auxiliary, char target) {
        if (numDiscs == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
        } else {
            solveTowerOfHanoi(numDiscs - 1, source, target, auxiliary);
            System.out.println("Move disk " + numDiscs + " from " + source + " to " + target);
            solveTowerOfHanoi(numDiscs - 1, auxiliary, source, target);
        }
    }
}

