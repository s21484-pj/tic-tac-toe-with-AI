package tictactoe.AI;

import java.util.Random;

public class MediumComputerPlayer {

    public MediumComputerPlayer() {
    }

    public void mediumAIMove(char[][] inputData, char XorO) {
        int countX = 0;
        int countO = 0;
        int countEmpty = 0;
        int winX = Integer.MAX_VALUE;
        int winY = Integer.MAX_VALUE;
        int blockX = Integer.MAX_VALUE;
        int blockY = Integer.MAX_VALUE;

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT HORIZONTAL ROWS

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {

                // FIRST HORIZONTAL ROW

                if (i == 0) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < 1; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < 1; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }

                // SECOND HORIZONTAL ROW

                if (i == 1) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 1; k < 2; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 1; k < 2; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }

                // THIRD HORIZONTAL ROW

                if (i == 2) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 2; k < 3; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 2; k < 3; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            countEmpty = 0;
            countO = 0;
            countX = 0;
        }

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT FIRST VERTICAL COLUMN

        countX = 0;
        countO = 0;
        countEmpty = 0;

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (j == 0) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < 1; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < 1; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT SECOND VERTICAL COLUMN

        countX = 0;
        countO = 0;
        countEmpty = 0;

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (j == 1) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 1; l < 2; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 1; l < 2; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT THIRD VERTICAL COLUMN

        countX = 0;
        countO = 0;
        countEmpty = 0;

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (j == 2) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 2; l < 3; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'X') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'O') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 2; l < 3; l++) {
                                if (inputData[k][l] == '_') {
                                    if (XorO == 'O') {
                                        winX = k;
                                        winY = l;
                                    } else if (XorO == 'X') {
                                        blockX = k;
                                        blockY = l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT FIRST DIAGONAL

        countX = 0;
        countO = 0;
        countEmpty = 0;

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (k == 0 && l == 0 || k == 1 && l == 1 || k == 2 && l == 2) {
                                    if (inputData[k][l] == '_') {
                                        if (XorO == 'X') {
                                            winX = k;
                                            winY = l;
                                        } else if (XorO == 'O') {
                                            blockX = k;
                                            blockY = l;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (k == 0 && l == 0 || k == 1 && l == 1 || k == 2 && l == 2) {
                                    if (inputData[k][l] == '_') {
                                        if (XorO == 'O') {
                                            winX = k;
                                            winY = l;
                                        } else if (XorO == 'X') {
                                            blockX = k;
                                            blockY = l;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // LOOKING FOR WIN OR BLOCK POSSIBILITY AT SECOND DIAGONAL

        countX = 0;
        countO = 0;
        countEmpty = 0;

        for (int i = 0; i < inputData.length; i++) {
            for (int j = 0; j < inputData.length; j++) {
                if (i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0) {
                    if (inputData[i][j] == 'X') {
                        countX += 1;
                    } else if (inputData[i][j] == 'O') {
                        countO += 1;
                    } else if (inputData[i][j] == '_'){
                        countEmpty += 1;
                    }
                    if (countX == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (k == 0 && l == 2 || k == 1 && l == 1 || k == 2 && l == 0) {
                                    if (inputData[k][l] == '_') {
                                        if (XorO == 'X') {
                                            winX = k;
                                            winY = l;
                                        } else if (XorO == 'O') {
                                            blockX = k;
                                            blockY = l;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (countO == 2 && countEmpty == 1) {
                        for (int k = 0; k < inputData.length; k++) {
                            for (int l = 0; l < inputData.length; l++) {
                                if (k == 0 && l == 2 || k == 1 && l == 1 || k == 2 && l == 0) {
                                    if (inputData[k][l] == '_') {
                                        if (XorO == 'O') {
                                            winX = k;
                                            winY = l;
                                        } else if (XorO == 'X') {
                                            blockX = k;
                                            blockY = l;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // MAKE MOVE

        if (winX != Integer.MAX_VALUE && winY != Integer.MAX_VALUE) {
            inputData[winX][winY] = XorO;
        } else if (blockX != Integer.MAX_VALUE && blockY != Integer.MAX_VALUE) {
            inputData[blockX][blockY] = XorO;
        } else {
            while (true) {
                Random random = new Random();
                int x = random.nextInt(3);
                int y = random.nextInt(3);
                if (inputData[x][y] == '_') {
                    inputData[x][y] = XorO;
                    break;
                }
            }
        }
    }
}
