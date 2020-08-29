package lcl.mm.pattern.factory.simpledemo;

public class SimplePizzaFactory {
    public Pizza creatPizza(String type){
        Pizza pizza = null;
        if(type.equals("BJ")){
            pizza = new BjPizza();
        }else if(type.equals("SH")){
            pizza = new ShPizza();
        }
        return pizza;
    }
}
