package factorymethod;

public class ChicagoPizzaStore extends  PizzaStore {


    //you can if else I don't have other types of pizzas right now but obviously they are are reason behind this pattern
    @Override
    protected Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();

    }
}
