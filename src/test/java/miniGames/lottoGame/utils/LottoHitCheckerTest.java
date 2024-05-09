package miniGames.lottoGame.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoHitCheckerTest {

    @ParameterizedTest(name = "expected numbers {0}, user numbers {1}, random numbers{2}")
    @MethodSource("provideExpectedNumbersUserNumbersRandomNumbers")
    void shouldSetOfHitNumbers(Set<Integer> expectedNumbers, Set<Integer> userNumbers, Set<Integer> randomGeneratedNumbers) {
        //given
        // when
        final Set<Integer> hitNumbers = LottoHitChecker.getHits(userNumbers, randomGeneratedNumbers);
        //then
        assertEquals(expectedNumbers, hitNumbers);

    }

    private static Stream<Arguments> provideExpectedNumbersUserNumbersRandomNumbers() {
        final Arguments argument1 = Arguments.of(new HashSet<>(List.of(1, 2, 3, 4, 5, 6)),
                new HashSet<>(List.of(1, 2, 3, 4, 5, 6)),
                new HashSet<>(List.of(1, 2, 3, 4, 5, 6)));
        final Arguments argument2 = Arguments.of(new HashSet<>(List.of(1, 2, 3)),
                new HashSet<>(List.of(1, 2, 3, 8, 9, 10)),
                new HashSet<>(List.of(1, 2, 3, 4, 5, 6)));
        final Arguments argument3 = Arguments.of(Collections.emptySet(),
                new HashSet<>(List.of(11, 21, 31, 41, 51, 61)),
                new HashSet<>(List.of(1, 2, 3, 4, 5, 6)));


        return Stream.of(argument1, argument2, argument3);
    }


}


