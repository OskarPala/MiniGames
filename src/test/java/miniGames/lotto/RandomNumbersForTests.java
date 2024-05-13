package miniGames.lotto;

import lombok.AllArgsConstructor;

import java.util.Set;
@AllArgsConstructor
public class RandomNumbersForTests implements NumbersGenerator {
     Set<Integer> numbers;
    @Override
    public Set<Integer> generateRandomNumbers() {
        return numbers;
    }
}
