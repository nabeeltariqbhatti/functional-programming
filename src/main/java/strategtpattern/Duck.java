package strategtpattern;

public abstract class Duck {

   private FlyBehaviour flyBehavior;
   private    QuackBehaviour quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public   void swim(){
        System.out.println(" I am swimming");
    }
    public abstract void display();

    public FlyBehaviour getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehaviour flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehaviour getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehaviour quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
