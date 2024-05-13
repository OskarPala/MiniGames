package miniGames.lotto;

import lombok.AllArgsConstructor;

import java.util.Set;
@AllArgsConstructor
public class UserNumbersForTests implements NumberReceiver {
    Set<Integer> numbers;
    @Override
    public Set<Integer> getNumbers() {
        return numbers;
    }
}
