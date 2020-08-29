package lcl.mm.pattern.factory.demo;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza creatPizza(String type);

}
