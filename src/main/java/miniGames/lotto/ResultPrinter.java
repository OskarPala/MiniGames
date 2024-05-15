package miniGames.lotto;

class ResultPrinter {

    static void printResult(LottoResult result) {
        printMessageIfWin(result);
        System.out.printf("You hit %s numbers %n", numberOfHits(result));
        printSetOfHitIfThereAre(result);
        System.out.printf("Your numbers %s %n", result.getUserNumber());
        System.out.printf("Drawn numbers %s %n", result.getRandomNumber());
    }

    private static void printSetOfHitIfThereAre(LottoResult result) {
        if (numberOfHits(result) != 0) {
            System.out.printf("Your hit numbers: %s %n", result.getUserHits());
        }
    }

    private static void printMessageIfWin(LottoResult result) {
        if (numberOfHits(result) == LottoGameConfigurator.NUMBERS_IN_DRAW) {
            System.out.println("CONGRATULATIONS YOU WIN");
        }
    }

    private static int numberOfHits(LottoResult result) {
        return result.getUserHits().size();
    }
}
