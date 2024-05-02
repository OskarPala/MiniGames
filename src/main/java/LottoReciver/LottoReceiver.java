package LottoReciver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoReceiver {


    public Set<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbersFromUser = new HashSet<>();


        while (numbersFromUser.size() < 6) {

            int inputNumbersCounter = 6 - numbersFromUser.size();
            System.out.printf("Give %s numbers %n", inputNumbersCounter);
            while (!scanner.hasNextInt()) {
                System.out.println("Enter an integer in a range 1 and 99");
                scanner.next();
            }
            int givenNumber = scanner.nextInt();
            validateInputNumber(givenNumber, numbersFromUser);
            System.out.println(numbersFromUser);
        }
        scanner.close();
        return numbersFromUser;
    }

    private void validateInputNumber(int givenNumber, Set<Integer> numbersFromUser) {
        if (givenNumber > 0 && givenNumber < 100) {
            numbersFromUser.add(givenNumber);
        } else {
            System.out.printf("You provide %s, Please provide number beetwen 1 and 99 %n", givenNumber);
        }


    }

}
