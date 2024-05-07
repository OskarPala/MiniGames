package miniGames.lottoGame.utils;

import miniGames.lottoGame.input.LottoReceiver;
import miniGames.lottoGame.model.LottoResult;
import miniGames.model.Result;

import java.util.Set;

public class LottoResultService implements Result<LottoResult> {
@Override
    public  LottoResult getResult() {
        final Set<Integer> userNumber = getUserNumber();
        final Set<Integer> randomNumber = LottoRandomNumbers.generateSixRandomNumbers();
        final Set<Integer> hitNumbers = LottoHitChecker.getHits(userNumber, randomNumber);

        return new LottoResult(userNumber, randomNumber, hitNumbers);

    }

    private static Set<Integer> getUserNumber() {
        LottoReceiver lottoReceiver = new LottoReceiver();
        return lottoReceiver.getNumbersFromUser();
    }

}
