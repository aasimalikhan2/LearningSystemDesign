package oberverDesignPattern.Observable;

import oberverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscriibers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
