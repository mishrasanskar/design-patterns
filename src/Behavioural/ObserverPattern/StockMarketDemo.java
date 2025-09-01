package Behavioural.ObserverPattern;

import java.util.Scanner;

public class StockMarketDemo {

    public static void main(String[] args) {



        StockMarket stockMarket = new StockMarket(5.00);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        stockMarket.registerObserver(investorA);
        stockMarket.registerObserver(investorB);


        stockMarket.setStockPrice("RIL", 25.00, 35.00);

    }
}
