package miniGames.lotto;

import java.util.Set;

class InputNumberProcessor {
    boolean addNumberIfIsInRange(Set<Integer> numbersFromUser, int givenNumber) {
        if (isInRange(givenNumber)) {
            addNumberToList(numbersFromUser, givenNumber);
            return true;
        }
        return false;
    }

    private void addNumberToList(Set<Integer> numbersFromUser, int givenNumber) {
        numbersFromUser.add(givenNumber);
    }

    private boolean isInRange(int givenNumber) {
        return givenNumber >= LottoGameConfigurator.LOWER_RANGE
                && givenNumber <= LottoGameConfigurator.HIGH_RANGE;
    }
}
