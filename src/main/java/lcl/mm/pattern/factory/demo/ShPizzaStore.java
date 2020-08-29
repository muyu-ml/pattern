package lcl.mm.pattern.factory.demo;

public class ShPizzaStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type) {
        if(type.equals("cheese")){
            return new ShStyleCheesePizza();
        }else {
            return null;
        }
    }
}
