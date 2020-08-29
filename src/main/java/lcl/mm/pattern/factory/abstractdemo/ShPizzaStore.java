package lcl.mm.pattern.factory.abstractdemo;

public class ShPizzaStore extends PizzaStore {
    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ShPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("上海奶酪披萨");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("上海海鲜披萨");
        }
        return pizza;
    }
}
