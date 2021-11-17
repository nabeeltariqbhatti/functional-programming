package adapter;

public class DuckAdapter implements Turkey {

    Duck duck;


    DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void gobble() {

        duck.quack();
    }

    @Override
    public void fly() throws Exception {

        duck.fly();
    }
}
