package com.design.patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create subject
        WeatherData weatherData = new WeatherData();

        //create observer
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);


        // create another observer
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        //cause change
        weatherData.setMeasurements(80,23,50);
        weatherData.setMeasurements(80,23,40);
    }
}