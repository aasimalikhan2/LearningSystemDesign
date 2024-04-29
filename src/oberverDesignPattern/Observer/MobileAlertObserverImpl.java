package oberverDesignPattern.Observer;

import oberverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailid, StocksObservable observable)
    {
        this.username = emailid;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock hurry up");
    }

    private void sendMsgOnMobile(String username, String msg) {
        System.out.println("msg sent to : " + username);
    }


}
