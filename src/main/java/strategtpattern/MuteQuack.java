package strategtpattern;

public class MuteQuack implements QuackBehaviour{


    @Override

    public void quack(){

        System.out.println("I  can't squeak or quack.");
    }
}