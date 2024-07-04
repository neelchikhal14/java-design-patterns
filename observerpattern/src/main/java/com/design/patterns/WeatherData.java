package com.design.patterns;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    // ArrayList to store observers
    private List<Observer> observers;

    // state that observers are interested in
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }



    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
            observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // notify observers
        measurementsChanged();
    }
}
