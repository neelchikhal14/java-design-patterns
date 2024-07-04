package com.design.patterns;

public class CurrentConditionsDisplay implements Observer,DisplayDevice{

    private float temperature;
    private float humidity;

    // provide a ref to Subject
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;

        // register the observer
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current condition: " + temperature +" degree F and humidity "+ humidity);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }
}
