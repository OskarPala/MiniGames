import java.security.SecureRandom;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class LottoRandomNumbers {
    public static Set<Integer>  generateSixRandomNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.ints(6, 1, 99)
                .boxed()
                .collect(toSet());
    }

}
