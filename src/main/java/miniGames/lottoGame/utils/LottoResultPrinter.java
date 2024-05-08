package miniGames.lottoGame.utils;

import miniGames.lottoGame.config.LottoGameConfigurator;
import miniGames.lottoGame.model.LottoResult;

public class LottoResultPrinter {
    public static void printResult(LottoResult result) {
        if(numberOfHits(result) == LottoGameConfigurator.NUMBERS_IN_DRAW)
        {
            System.out.println("CONGRATULATIONS YOU WIN");
        }

        System.out.printf("You hit %s numbers %n", numberOfHits(result));
        System.out.printf("Your hit numbers %s %n", result.getUserHits());
        System.out.printf("Your numbers %s %n", result.getUserNumber());
        System.out.printf("Drawn numbers %s %n", result.getRandomNumber());

    }

    private static int numberOfHits(LottoResult result) {
        return result.getUserHits().size();
    }

}
