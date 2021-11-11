package ch2;

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

        TapeDeck t = new TapeDeck();


        t.canRecord = true;


        t.playTape();

        t.recordTape();
    }
}