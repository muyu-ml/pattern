package lcl.mm.pattern.stretegy.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new QuackImpl();
        flyBehavior = new FlyImpl();
    }
    @Override
    public void display() {
        log.info("I'm mallard duck!");
    }

}
