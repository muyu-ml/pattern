package lcl.mm.pattern.factory.simpledemo;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaStore {
    /*public Pizza orderPizza(String type){
        Pizza pizza = null;
        if(type.equals("BJ")){
            pizza = new BjPizza();
        }else if(type.equals("SH")){
            pizza = new ShPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }*/

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.creatPizza("BJ");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        log.info("pizza return:【{}】", JSON.toJSONString(pizza));
        return pizza;
    }

}
