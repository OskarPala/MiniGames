package miniGames.lotto;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@AllArgsConstructor
class UserNumberReceiver implements NumberReceiver {

    Scanner scanner;

    @Override
    public Set<Integer> getNumbers() {
        Set<Integer> numbersFromUser = new HashSet<>();
        while (lowerThanNumbersInDrawn(numbersFromUser)) {
            int inputNumbersCounter = LottoGameConfigurator.NUMBERS_IN_DRAW - numbersFromUser.size();
            System.out.printf("Give %s numbers %n", inputNumbersCounter);
            while (!scanner.hasNextInt()) {
                System.out.printf("Enter an integer in a range %s and %s%n",
                        LottoGameConfigurator.LOWER_RANGE,
                        LottoGameConfigurator.HIGH_RANGE);
                scanner.next();
            }
            int givenNumber = scanner.nextInt();
            if (isInRange(givenNumber)) {
                numbersFromUser.add(givenNumber);
            } else {
                printOutOfRangeMessage(givenNumber);
            }
            System.out.println("Your given numbers: " + numbersFromUser);
        }
        return numbersFromUser;
    }

    private void printOutOfRangeMessage(int givenNumber) {
        System.out.printf("You provide %s, Please provide number beetwen %s and %s %n",
                givenNumber,
                LottoGameConfigurator.LOWER_RANGE,
                LottoGameConfigurator.HIGH_RANGE);
    }

    private boolean lowerThanNumbersInDrawn(Set<Integer> numbersFromUser) {
        return numbersFromUser.size() < LottoGameConfigurator.NUMBERS_IN_DRAW;
    }

    private boolean isInRange(int givenNumber) {
        return givenNumber >= LottoGameConfigurator.LOWER_RANGE
                && givenNumber <= LottoGameConfigurator.HIGH_RANGE;
    }
}
