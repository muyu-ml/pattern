package lcl.mm.pattern.factory.abstractdemo;

public class BjPizzaStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new BjPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("北京奶酪披萨");
        }else if(type.equals("clam")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("北京海鲜披萨");
        }
        return pizza;
    }
}
