

package tictactoe;



public class Game {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;

    public Game() {
        board = new Board();
        playerX = new Player('X');
        playerO = new Player('O');
        currentPlayer = playerX;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public boolean checkWinner() {
        return board.isWinner(currentPlayer.getSymbol());
    }

    public boolean checkDraw() {
        return board.isFull();
    }
}

