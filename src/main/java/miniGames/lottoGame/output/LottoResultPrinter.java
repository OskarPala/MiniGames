package miniGames.lottoGame.output;

import miniGames.lottoGame.model.LottoResult;

public class LottoResultPrinter {
    public static void printResult(LottoResult result) {
        System.out.printf("You hit %s numbers %n", result.getUserHits().size());
        System.out.printf("Your hit numbers %s %n", result.getUserHits());
        System.out.printf("Your numbers %s %n", result.getUserNumber());
        System.out.printf("Drawn numbers %s %n", result.getRandomNumber());

    }

}
