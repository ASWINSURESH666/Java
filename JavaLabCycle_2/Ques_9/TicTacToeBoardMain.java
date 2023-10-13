/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_9;

import javax.swing.SwingUtilities;

/**
 *
 * @author HP
 */
public class TicTacToeBoardMain {
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TicTacToeBoard();
        });
    }
}
