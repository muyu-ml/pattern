package lcl.mm.pattern.stretegy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuackImpl implements QuackBehavior {
    @Override
    public void quack() {
      log.info("I can quack");
    }
}
