package miniGames.lotto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import miniGames.model.Result;

import java.util.Set;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
final class LottoResult implements Result {

    private final Set<Integer> userNumber;
    private final Set<Integer> randomNumber;
    private final Set<Integer> userHits;

    static LottoResult getResult(NumberReceiver inputNumbersLoop, NumbersGenerator numbersGenerator) {
        LottoHitChecker lottoHitChecker = new LottoHitChecker();
        final Set<Integer> userNumber = inputNumbersLoop.getNumbers();
        final Set<Integer> randomNumber = numbersGenerator.generateRandomNumbers();
        final Set<Integer> hitNumbers = lottoHitChecker.getHits(userNumber, randomNumber);
        return new LottoResult(userNumber, randomNumber, hitNumbers);
    }
}

