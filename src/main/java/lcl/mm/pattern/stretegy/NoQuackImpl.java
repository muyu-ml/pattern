package lcl.mm.pattern.stretegy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoQuackImpl implements QuackBehavior{
    @Override
    public void quack() {
        log.info("I can't quack");
    }
}
