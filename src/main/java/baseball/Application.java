package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        do {
            baseballGame.startGame();
        } while (baseballGame.restartGame());
    }
}
