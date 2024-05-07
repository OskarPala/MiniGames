public class LottoResultPrinter {
    public static void printResult(LottoResult result) {
        System.out.printf("You hit %s numbers %n", result.getUserHits().size());
        System.out.printf("Your numbers %s %n", result.getUserNumber());
        System.out.printf("Drawn numbers %s", result.getRandomNumber());

    }

}
