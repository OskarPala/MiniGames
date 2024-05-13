package miniGames.lotto;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoResulTest {

    @Test
    void shouldReturnSetWithSixHitNumbers() {
        //given
        NumberReceiver userNumbersForTests = new UserNumbersForTests(Set.of(1, 2, 3, 4, 5, 6));
        NumbersGenerator randomNumbersForTests = new RandomNumbersForTests(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> expectedResult = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        //when
        final Set<Integer> result = (LottoResult.getResult(userNumbersForTests, randomNumbersForTests)).getUserHits();
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnSetWithThreeHitNumbers() {
        //given
        NumberReceiver userNumbersForTests = new UserNumbersForTests(Set.of(1, 2, 3, 4, 5, 6));
        NumbersGenerator randomNumbersForTests = new RandomNumbersForTests(Set.of(1, 2, 3, 9, 8, 7));
        Set<Integer> expectedResult = new HashSet<>(List.of(1, 2, 3));
        //when
        final Set<Integer> result = (LottoResult.getResult(userNumbersForTests, randomNumbersForTests)).getUserHits();
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnEmptySet() {
        //given
        NumberReceiver userNumbersForTests = new UserNumbersForTests(Set.of(1, 2, 3, 4, 5, 6));
        NumbersGenerator randomNumbersForTests = new RandomNumbersForTests(Set.of(11, 22, 33, 99, 88, 77));
        Set<Integer> expectedResult = Collections.emptySet();
        //when
        final Set<Integer> result = (LottoResult.getResult(userNumbersForTests, randomNumbersForTests)).getUserHits();
        //then
        assertEquals(expectedResult, result);
    }
}

