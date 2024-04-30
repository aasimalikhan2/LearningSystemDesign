package observerDesignPattern2.Observable;

import observerDesignPattern2.Observer.NotificationAlertObserver;

public interface StockObservable{
    public void remove(NotificationAlertObserver obj);
    public void add(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
