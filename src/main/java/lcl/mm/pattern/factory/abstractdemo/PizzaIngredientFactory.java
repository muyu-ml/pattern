package lcl.mm.pattern.factory.abstractdemo;

/**
 * 原料工厂接口
 */
public interface PizzaIngredientFactory {
    public String creatDough();
    public String creatSauce();
    public String[] creatVeggies();
    public String creatCheese();
    public String creatPepperoni();
    public String creatClam();
}
