package miniGames;

import miniGames.lotto.LottoGame;
import miniGames.lotto.LottoGameConfigurator;

import java.util.Scanner;

public class MiniGameChooser {
    public static void gameChooser() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nChose game by press game number and Enter %n");
        printGame(LottoGameConfigurator.GAME_ID, LottoGameConfigurator.GAME_NAME);
        System.out.println("To End game input \"EXIT\" ");
        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (LottoGameConfigurator.GAME_ID.equals(command)) {
                System.out.println("Starting " + LottoGameConfigurator.GAME_NAME);
                getLottoGame();
            } else if ("EXIT".equals(command)) {
                break;
            } else {
                System.out.println("This game number doesn't exist.");
                System.out.println("Please chose number from list");
                printGame(LottoGameConfigurator.GAME_ID, LottoGameConfigurator.GAME_NAME);
            }
        }
    }

    private static void getLottoGame() {
        LottoGame lottoGame = new LottoGame();
        lottoGame.startGame();
    }

    @SuppressWarnings("SameParameterValue")
    private static void printGame(String id, String name) {
        System.out.printf("%s  %s  %n", id, name);
    }
}
