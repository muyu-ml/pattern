package lcl.mm.pattern.observer.demo2;

import java.util.Observable;

public class WeatherData2 extends Observable {

    private int temperature;
    private int humidity;
    private int pressure;

    public void changed(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyChanged();
    }

    private void notifyChanged(){
        setChanged();
        notifyObservers();
    }

    public int getTemperature(){
        return temperature;
    }

    public int getHumidity(){
        return  humidity;
    }

    public int getPressure(){
        return pressure;
    }
}
