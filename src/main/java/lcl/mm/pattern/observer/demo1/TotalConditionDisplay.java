package lcl.mm.pattern.observer.demo1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TotalConditionDisplay implements MyObserver,DisplayElement {

    private int temperature;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;

    @Override
    public void display() {
        log.info("TotalConditionDisplay：{},{},{}",temperature,humidity,pressure);
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temperature = temp*10;
        this.humidity = humidity*10;
        this.pressure = pressure*10;
        display();
    }

    public TotalConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
