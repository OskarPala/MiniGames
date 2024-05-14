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
        while (areRemainingNumbersToInput(numbersFromUser)) {
            System.out.printf("Give %s numbers %n", countRemainingNumbers(numbersFromUser));
            int givenNumber = getValidNumberFromUser();
            processGivenNumber(numbersFromUser, givenNumber);
            printGivenNumbers(numbersFromUser);
        }
        return numbersFromUser;
    }

    private boolean areRemainingNumbersToInput(Set<Integer> numbersFromUser) {
        return numbersFromUser.size() < LottoGameConfigurator.NUMBERS_IN_DRAW;
    }

    private int countRemainingNumbers(Set<Integer> numbersFromUser) {
        return LottoGameConfigurator.NUMBERS_IN_DRAW - numbersFromUser.size();
    }

    private int getValidNumberFromUser() {
        while (!scanner.hasNextInt()) {
            System.out.printf("Enter an integer in a range %s and %s%n",
                    LottoGameConfigurator.LOWER_RANGE,
                    LottoGameConfigurator.HIGH_RANGE);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void processGivenNumber(Set<Integer> numbersFromUser, int givenNumber) {
        if (isInRange(givenNumber)) {
            addNumberToList(numbersFromUser, givenNumber);
        } else {
            printOutOfRangeMessage(givenNumber);
        }
    }

    private boolean isInRange(int givenNumber) {
        return givenNumber >= LottoGameConfigurator.LOWER_RANGE
                && givenNumber <= LottoGameConfigurator.HIGH_RANGE;
    }

    private void addNumberToList(Set<Integer> numbersFromUser, int givenNumber) {
        numbersFromUser.add(givenNumber);
    }

    private void printGivenNumbers(Set<Integer> numbersFromUser) {
        System.out.println("Your given numbers: " + numbersFromUser);
    }

    private void printOutOfRangeMessage(int givenNumber) {
        System.out.printf("You provide %s, Please provide number between %s and %s %n",
                givenNumber,
                LottoGameConfigurator.LOWER_RANGE,
                LottoGameConfigurator.HIGH_RANGE);
    }
}