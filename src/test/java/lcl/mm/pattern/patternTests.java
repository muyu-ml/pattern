package lcl.mm.pattern;

import lcl.mm.pattern.observer.demo1.CurrentConditionDisplay;
import lcl.mm.pattern.observer.demo1.TotalConditionDisplay;
import lcl.mm.pattern.observer.demo1.WeatherData;
import lcl.mm.pattern.observer.demo2.CurrentConditionDisplay2;
import lcl.mm.pattern.observer.demo2.TotalConditionDisplay2;
import lcl.mm.pattern.observer.demo2.WeatherData2;
import lcl.mm.pattern.stretegy.demo1.Duck;
import lcl.mm.pattern.stretegy.demo1.MallardDuck;
import lcl.mm.pattern.stretegy.demo1.SqueakDuck;
import lcl.mm.pattern.stretegy.demo2.OperationAdd;
import lcl.mm.pattern.stretegy.demo2.OperationInterface;
import lcl.mm.pattern.stretegy.demo2.OperationSub;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Observable;

@Slf4j
@SpringBootTest
class patternTests {

    @Test
    void strategyTest1() {
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

    @Test
    void strategyTest2() {
        int num1 = 10;
        int num2 = 5;
        OperationInterface operation = new OperationSub();
        log.info("new OperationSub()====={}",operation.doOperation(num1,num2));
        operation = new OperationAdd();
        log.info("new OperationAdd()====={}",operation.doOperation(num1,num2));

    }

    @Test
    void observerTest1(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        TotalConditionDisplay totalConditionDisplay = new TotalConditionDisplay(weatherData);
        log.info("register observer:CurrentConditionDisplay,TotalConditionDisplay");
        weatherData.setChangeed(1,2,3);
        weatherData.setChangeed(4,5,6);
        log.info("remove register currentConditionDisplay");
        weatherData.removeOberver(currentConditionDisplay);
        weatherData.setChangeed(5,6,7);
    }

    @Test
    void observerTest2(){
        WeatherData2 weatherData = new WeatherData2();
        log.info("register observer:CurrentConditionDisplay,TotalConditionDisplay");
        CurrentConditionDisplay2 currentConditionDisplay2 = new CurrentConditionDisplay2(weatherData);
        TotalConditionDisplay2 totalConditionDisplay2 = new TotalConditionDisplay2(weatherData);
        weatherData.changed(1,2,3);
        weatherData.changed(4,5,6);

        
        log.info("remove register currentConditionDisplay");
        weatherData.deleteObserver(currentConditionDisplay2);
        weatherData.changed(7,8,9);
    }

}
