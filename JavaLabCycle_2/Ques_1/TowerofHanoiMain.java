/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_1;

/**
 *
 * @author HP
 */
public class TowerofHanoiMain {
    public static void main(String[] args) {
        int numDiscs = 3;
        char sourcePeg = 'A';
        char auxiliaryPeg = 'B';
        char targetPeg = 'C';

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.solveTowerOfHanoi(numDiscs, sourcePeg, auxiliaryPeg, targetPeg);
}
}