package ch2;

import java.util.Scanner;

class TapeDeck {
    boolean canRecord = false;
    void playTape() {
        System.out.println("tape playing");

    }
    void recordTape() {
        System.out.println("tape recording");
    }
}

public class TapeDeckTest{


    public static void main(String[] args){
        GameHelper gameHelper = new GameHelper();

      String  s =   gameHelper.getUserInput("Input");

        System.out.println(s);

        TapeDeck t = new TapeDeck();


        t.canRecord = true;


        t.playTape();

        t.recordTape();
         s = null;

        Scanner scanner = new Scanner(System.in);

         s = scanner.nextLine();
        System.out.println(s);
    }
}