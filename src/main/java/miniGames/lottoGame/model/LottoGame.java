package miniGames.lottoGame.model;

import miniGames.lottoGame.input.MiniGameChooser;
import miniGames.lottoGame.output.LottoResultPrinter;
import miniGames.lottoGame.utils.LottoResultService;
import miniGames.model.Game;

public class LottoGame implements Game {
    @Override
    public void startGame() {
        LottoResultService lottoResultService = new LottoResultService();
        LottoResult lottoResult = lottoResultService.getResult();
        LottoResultPrinter.printResult(lottoResult);
        MiniGameChooser.gameChooser();
    }
}
