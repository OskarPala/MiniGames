package miniGames.lottoGame.input;

import miniGames.lottoGame.config.LottoGameConfigurator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoReceiver {


    public Set<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbersFromUser = new HashSet<>();


        while (lowerThanNumbersInDrawn(numbersFromUser)) {

            int inputNumbersCounter = LottoGameConfigurator.NUMBERS_IN_DRAW - numbersFromUser.size();
            System.out.printf("Give %s numbers %n", inputNumbersCounter);
            while (!scanner.hasNextInt()) {
                System.out.printf("Enter an integer in a range %s and %s%n" ,
                        LottoGameConfigurator.LOWER_RANGE,
                        LottoGameConfigurator.HIGH_RANGE);
                scanner.next();
            }
            int givenNumber = scanner.nextInt();
            validateInputNumber(givenNumber, numbersFromUser);
            System.out.println("Your given numbers: "+numbersFromUser);
        }
        return numbersFromUser;
    }

    private void validateInputNumber(int givenNumber, Set<Integer> numbersFromUser) {
        if (isInRange(givenNumber)) {
            numbersFromUser.add(givenNumber);
        } else {
            System.out.printf("You provide %s, Please provide number beetwen %s and %s %n",
                    givenNumber,
                    LottoGameConfigurator.LOWER_RANGE,
                    LottoGameConfigurator.HIGH_RANGE);
        }


    }

    private static boolean lowerThanNumbersInDrawn(Set<Integer> numbersFromUser) {
        return numbersFromUser.size() < LottoGameConfigurator.NUMBERS_IN_DRAW;
    }

    private static boolean isInRange(int givenNumber) {
        return givenNumber >= LottoGameConfigurator.LOWER_RANGE
                && givenNumber <= LottoGameConfigurator.HIGH_RANGE;
    }

}

