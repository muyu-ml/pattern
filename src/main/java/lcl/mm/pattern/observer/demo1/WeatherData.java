package lcl.mm.pattern.observer.demo1;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<MyObserver> observers = new ArrayList<>();
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeOberver(MyObserver o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (MyObserver o:observers) {
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * 数据变更
     */
    public void setChangeed(int temperature,int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();
    }
}
