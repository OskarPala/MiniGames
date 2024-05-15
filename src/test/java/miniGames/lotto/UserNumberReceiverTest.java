package miniGames.lotto;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserNumberReceiverTest {

    @Test
    void shouldReturnSetOfNumbersWhenAllInputInRange() {
        //given
        Set<Integer> expectedNumbers = new HashSet<>((Arrays.asList(1, 2, 3, 4, 5, 6)));
        String givenNumbers = "1 2 3 4 5 6 ";
        Scanner userNumbers = mockScannerIn(givenNumbers);
        NumberReceiver lottoReceiver = new UserNumberReceiver(userNumbers,new UserMessagePrinter(),new InputNumberProcessor());
        //when
        final Set<Integer> userInputNumbers = lottoReceiver.getNumbers();
        //then
        assertEquals(expectedNumbers, userInputNumbers);
    }

    @Test
    void shouldReturnSetOfNumbersWhenOneInputOutOfRange() {
        //given
        Set<Integer> expectedNumbers = new HashSet<>((Arrays.asList(1, 2, 3, 4, 5, 6)));
        String givenNumbers = "1 2 345 3 4 5 6 ";
        Scanner userNumbers = mockScannerIn(givenNumbers);
        NumberReceiver lottoReceiver = new UserNumberReceiver(userNumbers,new UserMessagePrinter(),new InputNumberProcessor());
        //when
        final Set<Integer> userInputNumbers = lottoReceiver.getNumbers();
        //then
        assertEquals(expectedNumbers, userInputNumbers);
    }

    private Scanner mockScannerIn(String data) {
        InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(inputStream);
        return scanner;
    }
}
