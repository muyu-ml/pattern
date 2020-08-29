package lcl.mm.pattern.factory.demo;

public class BjPizzaStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type) {
        if(type.equals("cheese")){
            return new BjStyleCheesePizza();
        }else {
            return null;
        }
    }
}
