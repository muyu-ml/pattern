package lcl.mm.pattern.stretegy.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        log.info("All duck float");
    }


}
