package lcl.mm.pattern;

import lcl.mm.pattern.stretegy.Duck;
import lcl.mm.pattern.stretegy.MallardDuck;
import lcl.mm.pattern.stretegy.SqueakDuck;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class patternTests {

    @Test
    void contextLoads() {
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck = new SqueakDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();

    }

}
