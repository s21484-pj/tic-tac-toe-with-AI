package tictactoe.Player;

import java.util.Scanner;

public class Player {

    public Player() {
    }

    public void makeMove(char[][] gameData, char XorO) {
        Scanner scanner = new Scanner(System.in);
        String coordinates = "";
        while (true) {
            try {
                System.out.print("Enter the coordinates: ");
                coordinates = scanner.nextLine();
                int x = coordinates.charAt(0);
                int y = coordinates.charAt(2);
                if (gameData[x - 49][y - 49] == '_') {
                    gameData[x - 49][y - 49] = XorO;
                    break;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } catch (Exception e) {
                coordinates = coordinates.replace(" ", "");
                char[] temp = coordinates.toCharArray();
                for (char c : temp) {
                    if (!Character.isDigit(c)) {
                        System.out.println("You should enter numbers!");
                        break;
                    } else if (c < 1 || c > 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        break;
                    }
                }
            }
        }
    }
}
