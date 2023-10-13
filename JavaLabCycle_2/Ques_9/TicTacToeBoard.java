/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_9;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class TicTacToeBoard extends JFrame {

    private char currentPlayer;
    private final JButton[] buttons;
    private boolean isGameOver;

    public TicTacToeBoard() {
        currentPlayer = 'X';
        buttons = new JButton[9];
        isGameOver = false;

        setTitle("Tic-Tac-Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));

        initializeButtons();
        addButtonsToFrame();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeButtons() {
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFocusPainted(false);
            int finalI = i;
            buttons[i].addActionListener((ActionEvent e) -> {
                if (buttons[finalI].getText().equals("") && !isGameOver) {
                    buttons[finalI].setText(String.valueOf(currentPlayer));
                    buttons[finalI].setForeground(currentPlayer == 'X' ? Color.RED : Color.BLUE);
                    isGameOver = checkWin(finalI);
                    if (!isGameOver) {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    } else {
                        JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                    }
                }
            });
        }
    }

    private void addButtonsToFrame() {
        for (int i = 0; i < 9; i++) {
            add(buttons[i]);
        }
    }

    private boolean checkWin(int move) {
        int row = move / 3;
        int col = move % 3;

       
        if (buttons[row * 3].getText().equals(String.valueOf(currentPlayer) )
            && buttons[row * 3 + 1].getText().equals(String.valueOf(currentPlayer))
            && buttons[row * 3 + 2].getText().equals(String.valueOf(currentPlayer)) ) {
            return true;
        }

        
        if (buttons[col].getText().equals(String.valueOf(currentPlayer))
            && buttons[col + 3].getText().equals(String.valueOf(currentPlayer))
            && buttons[col + 6].getText().equals(String.valueOf(currentPlayer)) ) {
            return true;
        }
        

        return (row == col || (row + col) == 2)
                && ((buttons[0].getText().equals(String.valueOf(currentPlayer))
                && buttons[4].getText().equals(String.valueOf(currentPlayer))
                && buttons[8].getText().equals(String.valueOf(currentPlayer)))
                || (buttons[2].getText().equals(String.valueOf(currentPlayer))
                && buttons[4].getText().equals(String.valueOf(currentPlayer))
                && buttons[6].getText().equals(String.valueOf(currentPlayer))));
    }
}