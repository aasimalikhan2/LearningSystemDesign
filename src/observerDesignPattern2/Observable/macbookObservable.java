package observerDesignPattern2.Observable;



import observerDesignPattern2.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class macbookObservable implements StockObservable {
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
    public void notifySubscribers() {
        for(NotificationAlertObserver obj : observerList)
        {
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0)
        {
            notifySubscribers();
        }
        stockCount = stockCount +  newStockAdded;
    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
