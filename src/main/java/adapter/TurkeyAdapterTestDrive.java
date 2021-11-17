package adapter;

public class TurkeyAdapterTestDrive {

    public static void main(String[] args) throws Exception {

        Duck duck = new TurkeyAdapter(new WildTurkey());

        duck.fly();
        duck.quack();
    }
}
