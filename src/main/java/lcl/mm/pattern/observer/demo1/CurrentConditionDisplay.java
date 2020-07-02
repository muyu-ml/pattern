package lcl.mm.pattern.observer.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionDisplay implements MyObserver,DisplayElement {

    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;

    @Override
    public void display() {
        log.info("CurrentConditionDisplay：{},{},{}",temperature,humidity,pressure);
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
