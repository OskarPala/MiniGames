package miniGames.lotto;

import java.util.Set;

class UserMessagePrinter {

    void printPromptForUser(Set<Integer> numbersFromUser) {
        System.out.printf("Give %s numbers %n", countRemainingNumbers(numbersFromUser));
    }

   private int countRemainingNumbers(Set<Integer> numbersFromUser) {
        return LottoGameConfigurator.NUMBERS_IN_DRAW - numbersFromUser.size();
    }

    void printGivenNumbers(Set<Integer> numbersFromUser) {
        System.out.println("Your given numbers: " + numbersFromUser);
    }

    void printOutOfRangeMessage(int givenNumber) {
        System.out.printf("You provide %s, Please provide number between %s and %s %n",
                givenNumber,
                LottoGameConfigurator.LOWER_RANGE,
                LottoGameConfigurator.HIGH_RANGE);
    }

    public void printWrongInputMessage() {
        System.out.printf("Enter an integer in a range %s and %s%n",
                LottoGameConfigurator.LOWER_RANGE,
                LottoGameConfigurator.HIGH_RANGE);
    }
}
