package lcl.mm.pattern.factory.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BjStyleCheesePizza extends Pizza {
    public BjStyleCheesePizza(){
        name = "北京风味的奶酪披萨";
        dough = "北京面团";
        sauce = "北京番茄酱";
        topping.add("北京高级奶酪");
    }

    public void cut(){
        log.info("将pizza切成正方形");
    }
}
