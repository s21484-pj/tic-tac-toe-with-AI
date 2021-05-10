package tictactoe.Game;

import tictactoe.AI.EasyComputerPlayer;
import tictactoe.AI.MediumComputerPlayer;
import tictactoe.Board.Board;
import tictactoe.Player.Player;

public class Game {

    private Board board;
    private Player player;
    private EasyComputerPlayer easyComputerPlayer;
    private MediumComputerPlayer mediumComputerPlayer;

    public Game() {
    }

    public void userVsUser(char[][] gameData) {
        board = new Board();
        player = new Player();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            player.makeMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            player.makeMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void easyVsEasy(char[][] gameData) {
        board = new Board();
        easyComputerPlayer = new EasyComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void userVsEasy(char[][] gameData) {
        board = new Board();
        player = new Player();
        easyComputerPlayer = new EasyComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            player.makeMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void easyVsUser(char[][] gameData) {
        board = new Board();
        player = new Player();
        easyComputerPlayer = new EasyComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            player.makeMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void userVsMedium(char[][] gameData) {
        board = new Board();
        player = new Player();
        mediumComputerPlayer = new MediumComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            player.makeMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void mediumVsUser(char[][] gameData) {
        board = new Board();
        player = new Player();
        mediumComputerPlayer = new MediumComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            player.makeMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void easyVsMedium(char[][] gameData) {
        board = new Board();
        easyComputerPlayer = new EasyComputerPlayer();
        mediumComputerPlayer = new MediumComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void mediumVsEasy(char[][] gameData) {
        board = new Board();
        easyComputerPlayer = new EasyComputerPlayer();
        mediumComputerPlayer = new MediumComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"easy\"");
            easyComputerPlayer.easyAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void mediumVsMedium(char[][] gameData) {
        board = new Board();
        mediumComputerPlayer = new MediumComputerPlayer();
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"medium\"");
            mediumComputerPlayer.mediumAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public String gameState(char[][] inputData) {
        String gameState = "";
        boolean xWin = false;
        boolean oWin = false;

        //X WIN

        if (inputData[0][0] == 'X' && inputData[0][1] == 'X' && inputData[0][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[1][0] == 'X' && inputData[1][1] == 'X' && inputData[1][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[2][0] == 'X' && inputData[2][1] == 'X' && inputData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[0][0] == 'X' && inputData[1][0] == 'X' && inputData[2][0] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[0][1] == 'X' && inputData[1][1] == 'X' && inputData[2][1] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[0][2] == 'X' && inputData[1][2] == 'X' && inputData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[0][0] == 'X' && inputData[1][1] == 'X' && inputData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (inputData[0][2] == 'X' && inputData[1][1] == 'X' && inputData[2][0] == 'X') {
            gameState = "X wins";
            xWin = true;
        }

        //O win

        if (inputData[0][0] == 'O' && inputData[0][1] == 'O' && inputData[0][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[1][0] == 'O' && inputData[1][1] == 'O' && inputData[1][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[2][0] == 'O' && inputData[2][1] == 'O' && inputData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[0][0] == 'O' && inputData[1][0] == 'O' && inputData[2][0] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[0][1] == 'O' && inputData[1][1] == 'O' && inputData[2][1] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[0][2] == 'O' && inputData[1][2] == 'O' && inputData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[0][0] == 'O' && inputData[1][1] == 'O' && inputData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (inputData[0][2] == 'O' && inputData[1][1] == 'O' && inputData[2][0] == 'O') {
            gameState = "O wins";
            oWin = true;
        }

        //Game not finished or draw

        int emptyCells = 0;
        if (!xWin && !oWin) {
            for (int i = 0; i < inputData.length; i++) {
                for (int j = 0; j < inputData[0].length; j++) {
                    if (inputData[i][j] != 'X' && inputData[i][j] != 'O') {
                        emptyCells++;
                    }
                }
            }
            if (emptyCells > 0) {
                gameState = "Game not finished";
            } else {
                gameState = "Draw";
            }
        }
        return gameState;
    }
}
