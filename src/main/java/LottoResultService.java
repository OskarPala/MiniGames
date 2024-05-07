import java.util.Set;

public class LottoResultService {


    public static LottoResult getLottoResult() {
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
