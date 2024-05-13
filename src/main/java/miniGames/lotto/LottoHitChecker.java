package miniGames.lotto;

import java.util.HashSet;
import java.util.Set;

class LottoHitChecker implements HitChecker {

    public Set<Integer> getHits(Set<Integer> userNumbers, Set<Integer> randomGeneratedNumbers) {
        Set<Integer> hitNumbers = new HashSet<>(userNumbers);
        hitNumbers.retainAll(randomGeneratedNumbers);
        return hitNumbers;
    }
}
