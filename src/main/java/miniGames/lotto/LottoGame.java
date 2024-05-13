package miniGames.lotto;

import miniGames.MiniGameChooser;
import miniGames.model.Game;

import java.util.Scanner;

public class LottoGame implements Game {
    @Override
    public void startGame() {
        NumberReceiver inputNumbersLoop = new UserNumberReceiver(new Scanner(System.in));
        NumbersGenerator numbersGenerator = new RandomNumbersGenerator();
        LottoResult lottoResult = LottoResult.getResult(inputNumbersLoop, numbersGenerator);
        LottoResultPrinter.printResult(lottoResult);
        MiniGameChooser.gameChooser();
    }
}
