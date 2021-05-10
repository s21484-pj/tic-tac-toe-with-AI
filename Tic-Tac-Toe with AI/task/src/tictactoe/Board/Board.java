package tictactoe.Board;

public class Board {

    public Board() {
    }

    public void printBoard(char[][] gameData) {
        char[][] map = new char[9][9];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (i == 2 && j == 2) {
                    map[i][j] = gameData[0][0];
                } else if (i == 2 && j == 4) {
                    map[i][j] = gameData[0][1];
                } else if (i == 2 && j == 6) {
                    map[i][j] = gameData[0][2];
                } else if (i == 4 && j == 2) {
                    map[i][j] = gameData[1][0];
                } else if (i == 4 && j == 4) {
                    map[i][j] = gameData[1][1];
                } else if (i == 4 && j == 6) {
                    map[i][j] = gameData[1][2];
                } else if (i == 6 && j == 2) {
                    map[i][j] = gameData[2][0];
                } else if (i == 6 && j == 4) {
                    map[i][j] = gameData[2][1];
                } else if (i == 6 && j == 6) {
                    map[i][j] = gameData[2][2];
                } else if (i == 0 || i == 8) {
                    map[i][j] = '-';
                } else if (i == 2 && j == 0 || i == 4 && j == 0 || i == 6 && j == 0) {
                    map[i][j] = '|';
                } else if (i == 2 && j == 8 || i == 4 && j == 8 || i == 6 && j == 8) {
                    map[i][j] = '|';
                } else {
                    map[i][j] = ' ';
                }
            }
        }
        for (char[] x : map) {
            for (char y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void clearBoard(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = '_';
            }
        }
    }
}
