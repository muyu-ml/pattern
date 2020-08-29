package lcl.mm.pattern.factory.abstractdemo;

public class BjPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String creatDough() {
        return "北京统一的面团原料";
    }

    @Override
    public String creatSauce() {
        return "北京统一的酱原料";
    }

    @Override
    public String[] creatVeggies() {
        String[] s = {"北京统一的青菜原料","北京统一的青椒原料"};
        return s;
    }

    @Override
    public String creatCheese() {
        return "北京统一的奶酪原料";
    }

    @Override
    public String creatPepperoni() {
        return "北京统一的香肠原料";
    }

    @Override
    public String creatClam() {
        return "北京统一的海鲜原料";
    }
}
