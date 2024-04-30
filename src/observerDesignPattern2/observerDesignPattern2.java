package observerDesignPattern2;

import observerDesignPattern2.Observable.StockObservable;
import observerDesignPattern2.Observable.macbookObservable;
import observerDesignPattern2.Observer.EmailAlertObserverImpl;
import observerDesignPattern2.Observer.NotificationAlertObserver;
import observerDesignPattern2.Observer.SMSAlertObserverImpl;

public class observerDesignPattern2 {
    public static void main(String[] args)
    {
        StockObservable macbookObservable = new macbookObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("aasimalikhan54321@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("emaadalikhan54321@gmail.com");
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("rida@gmail.com");
        NotificationAlertObserver observer4= new SMSAlertObserverImpl("9121795607");

        macbookObservable.add(observer1);
        macbookObservable.add(observer2);
        macbookObservable.add(observer3);
        macbookObservable.add(observer4);

        macbookObservable.setStockCount(1);
    }
}
