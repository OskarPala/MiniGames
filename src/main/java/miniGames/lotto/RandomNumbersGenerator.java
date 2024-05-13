package miniGames.lotto;

import java.security.SecureRandom;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

class RandomNumbersGenerator implements NumbersGenerator {

    public Set<Integer> generateRandomNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.ints(
                        LottoGameConfigurator.NUMBERS_IN_DRAW,
                        LottoGameConfigurator.LOWER_RANGE,
                        LottoGameConfigurator.HIGH_RANGE)
                .boxed()
                .collect(toSet());
    }
}
