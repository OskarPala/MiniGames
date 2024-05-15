package miniGames.lotto;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@AllArgsConstructor
class UserNumberReceiver implements NumberReceiver {

    Scanner scanner;
    UserMessagePrinter userMessagePrinter;
    InputNumberProcessor inputNumberProcessor;

    @Override
    public Set<Integer> getNumbers() {
        Set<Integer> numbersFromUser = new HashSet<>();


        while (areRemainingNumbersToInput(numbersFromUser)) {
            userMessagePrinter.printPromptForUser(numbersFromUser);
            int givenNumber = getValidNumberFromUser(userMessagePrinter);
            boolean addResult = inputNumberProcessor.addNumberIfIsInRange(numbersFromUser, givenNumber);
            printMessageIfOutOfRangeInput(addResult, givenNumber);
            userMessagePrinter.printGivenNumbers(numbersFromUser);
        }
        return numbersFromUser;
    }

    private void printMessageIfOutOfRangeInput(boolean addResult, int givenNumber) {
        if (!addResult) {
            userMessagePrinter.printOutOfRangeMessage(givenNumber);
        }
    }

    private boolean areRemainingNumbersToInput(Set<Integer> numbersFromUser) {
        return numbersFromUser.size() < LottoGameConfigurator.NUMBERS_IN_DRAW;
    }

    private int getValidNumberFromUser(UserMessagePrinter userMessagePrinter) {
        while (!scanner.hasNextInt()) {
            userMessagePrinter.printWrongInputMessage();
            scanner.next();
        }
        return scanner.nextInt();
    }
}