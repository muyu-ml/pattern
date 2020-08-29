package lcl.mm.pattern.factory.abstractdemo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza( PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        log.info("准备{}pizza", name);
        dough = pizzaIngredientFactory.creatDough();
        sauce = pizzaIngredientFactory.creatSauce();
        cheese = pizzaIngredientFactory.creatCheese();
    }
}
