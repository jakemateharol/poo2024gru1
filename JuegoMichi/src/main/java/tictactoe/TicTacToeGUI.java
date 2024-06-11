package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI extends JFrame {

    private Game game;
    private JButton[][] buttons;

    public TicTacToeGUI() {
        game = new Game();
        buttons = new JButton[3][3];
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Tres en Raya");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                final int row = i;
                final int col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleButtonClick(row, col);
                    }
                });
                add(buttons[i][j]);
            }
        }
    }

    private void handleButtonClick(int row, int col) {
        if (game.getBoard().isValidMove(row, col)) {
            buttons[row][col].setText(String.valueOf(game.getCurrentPlayer().getSymbol()));
            game.getBoard().placeMove(row, col, game.getCurrentPlayer().getSymbol());
            if (game.checkWinner()) {
                JOptionPane.showMessageDialog(this, "¡El jugador " + game.getCurrentPlayer().getSymbol() + " gana!");
                resetGame();
            } else if (game.checkDraw()) {
                JOptionPane.showMessageDialog(this, "¡El juego termina en empate!");
                resetGame();
            } else {
                game.switchPlayer();
            }
        }
    }

    private void resetGame() {
        game = new Game();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
    }
}
