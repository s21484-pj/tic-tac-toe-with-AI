package tictactoe.AI;

import java.util.Random;

public class EasyComputerPlayer {

    public EasyComputerPlayer() {
    }

    public void easyAIMove(char[][] inputData, char XorO) {
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
