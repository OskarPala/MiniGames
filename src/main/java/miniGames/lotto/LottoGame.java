package miniGames.lotto;

import miniGames.model.Game;

import java.util.Scanner;

public class LottoGame implements Game {
    @Override
    public void startGame() {
        NumberReceiver inputNumbersLoop = getInputNumbersLoop();
        NumbersGenerator numbersGenerator = new RandomNumbersGenerator();
        LottoResult lottoResult = LottoResult.getResult(inputNumbersLoop, numbersGenerator);
        ResultPrinter.printResult(lottoResult);
    }

    private UserNumberReceiver getInputNumbersLoop() {
        Scanner scanner = new Scanner(System.in);
        UserMessagePrinter printer = new UserMessagePrinter();
        InputNumberProcessor numberProcessor = new InputNumberProcessor();

        return new UserNumberReceiver(scanner, printer, numberProcessor);
    }
}
