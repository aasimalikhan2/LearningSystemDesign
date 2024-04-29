package oberverDesignPattern;

import oberverDesignPattern.Observable.StocksObservable;
import oberverDesignPattern.Observable.iphoneObservable;
import oberverDesignPattern.Observer.EmailAlertObserverimpl;
import oberverDesignPattern.Observer.MobileAlertObserverImpl;
import oberverDesignPattern.Observer.NotificationAlertObserver;

public class observerDesignPattern {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new iphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserverimpl("aasim@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverimpl("emaad@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("aasimali", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
