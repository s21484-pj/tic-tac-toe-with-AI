package tictactoe;

import tictactoe.AI.EasyComputerPlayer;
import tictactoe.AI.HardComputerPlayer;
import tictactoe.AI.MediumComputerPlayer;
import tictactoe.Board.Board;
import tictactoe.Game.Game;
import tictactoe.Player.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] gameData = new char[3][3];

        for (int i = 0; i < gameData.length; i++) {
            for (int j = 0; j < gameData[0].length; j++) {
                gameData[i][j] = '_';
            }
        }

        Game game = new Game(new Board(),
                new Player(),
                new EasyComputerPlayer(),
                new MediumComputerPlayer(),
                new HardComputerPlayer());
        Board board = new Board();

        while (true) {
            System.out.print("Input command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "start user user":
                    game.userVsUser(gameData);
                    break;
                case "start user easy":
                    game.userVsEasy(gameData);
                    break;
                case "start user medium":
                    game.userVsMedium(gameData);
                    break;
                case "start user hard":
                    game.userVsHard(gameData);
                    break;
                case "start easy user":
                    game.easyVsUser(gameData);
                    break;
                case "start medium user":
                    game.mediumVsUser(gameData);
                    break;
                case "start hard user":
                    game.hardVsUser(gameData);
                    break;
                case "start easy easy":
                    game.easyVsEasy(gameData);
                    break;
                case "start easy medium":
                    game.easyVsMedium(gameData);
                    break;
                case "start easy hard":
                    game.easyVsHard(gameData);
                    break;
                case "start medium easy":
                    game.mediumVsEasy(gameData);
                    break;
                case "start hard easy":
                    game.hardVsEasy(gameData);
                    break;
                case "start medium hard":
                    game.mediumVsHard(gameData);
                    break;
                case "start hard medium":
                    game.hardVsMedium(gameData);
                    break;
                case "start medium medium":
                    game.mediumVsMedium(gameData);
                    break;
                case "start hard hard":
                    game.hardVsHard(gameData);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Bad parameters!");
            }
            if (command.equals("exit")) {
                break;
            }
            board.clearBoard(gameData);
        }
    }
}
