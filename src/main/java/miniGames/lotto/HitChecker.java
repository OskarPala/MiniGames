package miniGames.lotto;

import java.util.Set;

interface HitChecker {
    Set<Integer> getHits(Set<Integer> userNumbers, Set<Integer> generatedNumbers);
}
