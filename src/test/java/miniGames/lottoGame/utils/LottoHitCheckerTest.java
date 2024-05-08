package miniGames.lottoGame.utils;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoHitCheckerTest {

    @Test
    void shouldReturnSetOfSixHitNumbers() {
        //given
        Set<Integer> expectedNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        Set<Integer> userNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        Set<Integer> randomGeneratedNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        // when
        final Set<Integer> hitNumbers = LottoHitChecker.getHits(userNumbers, randomGeneratedNumbers);
        //then
        assertEquals(expectedNumbers, hitNumbers);

    }
    @Test
    void shouldReturnSetOfThreeHitNumbers() {
        //given
        Set<Integer> expectedNumbers = new HashSet<>(List.of(1, 2, 3 ));
        Set<Integer> userNumbers = new HashSet<>(List.of(1, 2, 3, 8, 9, 10));
        Set<Integer> randomGeneratedNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        // when
        final Set<Integer> hitNumbers = LottoHitChecker.getHits(userNumbers, randomGeneratedNumbers);
        //then
        assertEquals(expectedNumbers, hitNumbers);

    } @Test
    void shouldReturnEmptySet() {
        //given
        Set<Integer> expectedNumbers = Collections.emptySet();
        Set<Integer> userNumbers = new HashSet<>(List.of(11, 21, 31, 41, 51, 61));
        Set<Integer> randomGeneratedNumbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        // when
        final Set<Integer> hitNumbers = LottoHitChecker.getHits(userNumbers, randomGeneratedNumbers);
        //then
        assertEquals(expectedNumbers, hitNumbers);

    }


}
