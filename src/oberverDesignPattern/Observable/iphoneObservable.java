package oberverDesignPattern.Observable;

import oberverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneObservable implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriibers() {
        for(NotificationAlertObserver observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0)
        {
            notifySubscriibers();
        }
        stockCount = stockCount + 1;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
