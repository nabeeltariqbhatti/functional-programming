package strategtpattern;

public class DuckTestDrive  {


    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();


        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
