import java.util.HashSet;
import java.util.Set;

public class LottoHitChecker {

    public static Set<Integer> getHits(Set<Integer> userNumbers, Set<Integer> randomGeneratedNumbers) {
        Set<Integer> hitNumbers = new HashSet<>(userNumbers);
        hitNumbers.retainAll(randomGeneratedNumbers);
        return hitNumbers;

    }


    }
