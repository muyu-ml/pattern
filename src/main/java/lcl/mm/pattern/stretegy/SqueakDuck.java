package lcl.mm.pattern.stretegy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SqueakDuck extends Duck{

    public SqueakDuck(){
        flyBehavior = new FlyImpl();
        quackBehavior = new NoQuackImpl();
    }

    @Override
    public void display() {
        log.info("I'm Squeak Duck");
    }
}
