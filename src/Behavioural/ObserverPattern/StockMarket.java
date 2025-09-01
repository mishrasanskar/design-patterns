package Behavioural.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

    private List<Observer> observers;
    private double priceChangeThreshold;
    public StockMarket(double priceChangeThreshold) {
        observers = new ArrayList<>();
        this.priceChangeThreshold = priceChangeThreshold;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String stockSymbol, double newPrice) {
        for (Observer o : observers) {
            o.update(stockSymbol, newPrice);
        }
    }

    public void setStockPrice(String stockSymbol, double oldPrice, double newPrice) {
        double diff = Math.abs(newPrice-oldPrice);
        if (diff >= priceChangeThreshold) {
            notifyObservers(stockSymbol, newPrice);
        }
    }


}
