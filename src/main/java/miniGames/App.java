package miniGames;

import LottoReciver.LottoReceiver;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LottoReceiver lottoReceiver = new LottoReceiver();

        System.out.println(lottoReceiver.getNumbersFromUser(scanner));


    }

}



