package tictactoe.AI;

public class HardComputerPlayer {

    public HardComputerPlayer() {
    }

    public void hardAIMove(char[][] inputData, char XorO) {
        HardComputerPlayerMove move = findBestMove(inputData, XorO);

        int x = move.getIndexX();
        int y = move.getIndexY();
        inputData[x][y] = XorO;
    }

    public boolean isMovesLeft(char[][] gameData) {
        for (int i = 0; i < gameData.length; i++) {
            for (int j = 0; j < gameData.length; j++) {
                if (gameData[i][j] == '_') {
                    return true;
                }
            }
        }
        return false;
    }

    public int minimax(char[][] newBoard, char XorO, int depth, boolean isMax) {
        char humanPlayer;
        char aiPlayer;

        if (XorO == 'X') {
            aiPlayer = 'X';
            humanPlayer = 'O';
        } else {
            aiPlayer = 'O';
            humanPlayer = 'X';
        }

        int score;
        if (winning(newBoard, humanPlayer)) {
            return score = -10;
        }
        else if (winning(newBoard, aiPlayer)) {
            return score = 10;
        }
        else if (!isMovesLeft(newBoard)){
            return score = 0;
        }

        int best;
        if (isMax) {
            best = Integer.MIN_VALUE;
            for (int i = 0; i < newBoard.length; i++) {
                for (int j = 0; j < newBoard.length; j++) {
                    if (newBoard[i][j] == '_') {
                        newBoard[i][j] = aiPlayer;
                        best = Math.max(best, minimax(
                                newBoard, XorO, depth + 1, false));
                        newBoard[i][j] = '_';
                    }
                }
            }
        } else {
            best = Integer.MAX_VALUE;
            for (int i = 0; i < newBoard.length; i++) {
                for (int j = 0; j < newBoard.length; j++) {
                    if (newBoard[i][j] == '_') {
                        newBoard[i][j] = humanPlayer;
                        best = Math.min(best, minimax(
                                newBoard, XorO, depth + 1, true));
                        newBoard[i][j] = '_';
                    }
                }
            }
        }
        return best;
    }

    public HardComputerPlayerMove findBestMove(char[][] inputData, char XorO) {
        char aiPlayer;

        if (XorO == 'X') {
            aiPlayer = 'X';
        } else {
            aiPlayer = 'O';
        }

        int bestVal = Integer.MIN_VALUE;
        HardComputerPlayerMove bestMove = new HardComputerPlayerMove();
        bestMove.setIndexX(-1);
        bestMove.setIndexY(-1);

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (inputData[i][j] == '_') {
                    inputData[i][j] = aiPlayer;
                    int moveVal = minimax(inputData, XorO, 0, false);
                    inputData[i][j] = '_';

                    if (moveVal > bestVal) {
                        bestMove.setIndexX(i);
                        bestMove.setIndexY(j);
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }

    // winning combinations using the board indexes
    public boolean winning(char[][] inputData, char player) {
        return (inputData[0][0] == player && inputData[0][1] == player && inputData[0][2] == player) ||
                (inputData[1][0] == player && inputData[1][1] == player && inputData[1][2] == player) ||
                (inputData[2][0] == player && inputData[2][1] == player && inputData[2][2] == player) ||
                (inputData[0][0] == player && inputData[1][0] == player && inputData[2][0] == player) ||
                (inputData[0][1] == player && inputData[1][1] == player && inputData[2][1] == player) ||
                (inputData[0][2] == player && inputData[1][2] == player && inputData[2][2] == player) ||
                (inputData[0][0] == player && inputData[1][1] == player && inputData[2][2] == player) ||
                (inputData[0][2] == player && inputData[1][1] == player && inputData[2][0] == player);
    }
}
