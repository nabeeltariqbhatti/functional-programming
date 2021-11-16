package decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = " Decaf Coffee ";
    }
    public double cost() {
        return .80;
    }
}