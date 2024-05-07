import java.security.SecureRandom;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class LottoRandomNumbers {
    public static Set<Integer> generateSixRandomNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.ints(
                        LottoGameConfigurator.NUMBERS_IN_DRAW,
                        LottoGameConfigurator.LOWER_RANGE,
                        LottoGameConfigurator.HIGH_RANGE)
                .boxed()
                .collect(toSet());
    }

}
