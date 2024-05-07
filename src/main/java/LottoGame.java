public class LottoGame {

    public static void startGame() {
        LottoResult lottoResult = LottoResultService.getLottoResult();
        LottoResultPrinter.printResult(lottoResult);
    }
}
