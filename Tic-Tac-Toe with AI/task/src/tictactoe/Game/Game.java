package tictactoe.Game;

import tictactoe.AI.EasyComputerPlayer;
import tictactoe.AI.HardComputerPlayer;
import tictactoe.AI.MediumComputerPlayer;
import tictactoe.Board.Board;
import tictactoe.Player.Player;

public class Game {

    private final Board board;
    private final Player player;
    private final EasyComputerPlayer easyComputerPlayer;
    private final MediumComputerPlayer mediumComputerPlayer;
    private final HardComputerPlayer hardComputerPlayer;

    public Game(Board board,
                Player player,
                EasyComputerPlayer easyComputerPlayer,
                MediumComputerPlayer mediumComputerPlayer,
                HardComputerPlayer hardComputerPlayer) {
        this.board = board;
        this.player = player;
        this.easyComputerPlayer = easyComputerPlayer;
        this.mediumComputerPlayer = mediumComputerPlayer;
        this.hardComputerPlayer = hardComputerPlayer;
    }

    public void userVsHard(char[][] gameData) {
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
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void hardVsUser(char[][] gameData) {
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'X');
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

    public void easyVsHard(char[][] gameData) {
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
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void hardVsEasy(char[][] gameData) {
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'X');
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

    public void mediumVsHard(char[][] gameData) {
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
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void hardVsMedium(char[][] gameData) {
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'X');
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

    public void hardVsHard(char[][] gameData) {
        boolean firstIteration = true;

        while (true) {
            if (firstIteration) {
                board.printBoard(gameData);
                firstIteration = false;
            }
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'X');
            board.printBoard(gameData);
            if (gameState(gameData).equals("X wins") || gameState(gameData).equals("Draw")) {
                System.out.println(gameState(gameData));
                break;
            }
            System.out.println("Making move level \"hard\"");
            hardComputerPlayer.hardAIMove(gameData, 'O');
            board.printBoard(gameData);
            if (gameState(gameData).equals("O wins")) {
                System.out.println(gameState(gameData));
                break;
            }
        }
    }

    public void userVsUser(char[][] gameData) {
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

    public String gameState(char[][] gameData) {
        String gameState = "";
        boolean xWin = false;
        boolean oWin = false;

        //X win

        if (gameData[0][0] == 'X' && gameData[0][1] == 'X' && gameData[0][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[1][0] == 'X' && gameData[1][1] == 'X' && gameData[1][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[2][0] == 'X' && gameData[2][1] == 'X' && gameData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[0][0] == 'X' && gameData[1][0] == 'X' && gameData[2][0] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[0][1] == 'X' && gameData[1][1] == 'X' && gameData[2][1] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[0][2] == 'X' && gameData[1][2] == 'X' && gameData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[0][0] == 'X' && gameData[1][1] == 'X' && gameData[2][2] == 'X') {
            gameState = "X wins";
            xWin = true;
        } else if (gameData[0][2] == 'X' && gameData[1][1] == 'X' && gameData[2][0] == 'X') {
            gameState = "X wins";
            xWin = true;
        }

        //O win

        if (gameData[0][0] == 'O' && gameData[0][1] == 'O' && gameData[0][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[1][0] == 'O' && gameData[1][1] == 'O' && gameData[1][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[2][0] == 'O' && gameData[2][1] == 'O' && gameData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[0][0] == 'O' && gameData[1][0] == 'O' && gameData[2][0] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[0][1] == 'O' && gameData[1][1] == 'O' && gameData[2][1] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[0][2] == 'O' && gameData[1][2] == 'O' && gameData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[0][0] == 'O' && gameData[1][1] == 'O' && gameData[2][2] == 'O') {
            gameState = "O wins";
            oWin = true;
        } else if (gameData[0][2] == 'O' && gameData[1][1] == 'O' && gameData[2][0] == 'O') {
            gameState = "O wins";
            oWin = true;
        }

        //Game not finished or draw

        int emptyCells = 0;
        if (!xWin && !oWin) {
            for (int i = 0; i < gameData.length; i++) {
                for (int j = 0; j < gameData[0].length; j++) {
                    if (gameData[i][j] != 'X' && gameData[i][j] != 'O') {
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
