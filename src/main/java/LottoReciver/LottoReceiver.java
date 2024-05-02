package LottoReciver;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoReceiver {
    Set<Integer> numbersFromUser = new HashSet<>();

    public Set<Integer> getNumbersFromUser(Scanner scanner) {


        while (numbersFromUser.size() < 6) {
            int inputNumbersCounter = 6 - numbersFromUser.size();
            System.out.printf("Give %s numbers %n", inputNumbersCounter);
            while (!scanner.hasNextInt()) {
                System.out.println("Cos");
                scanner.next();
            }
            numbersFromUser.add(scanner.nextInt());
            System.out.println(numbersFromUser);
        }
        return numbersFromUser;
    }

    ;
}
