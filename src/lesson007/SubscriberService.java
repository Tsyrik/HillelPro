package lesson007;

public interface SubscriberService {


    void infoSubscriberLimitExceeded(Subscriber[] v, double limit);

    void usedInternationalCalls(Subscriber[] v, double limit);

    void subscriberDataSearchByLetter(Subscriber[] v, char symbol);

    void totalTrafficForTheCity(Subscriber[] v, String nane);

    void subscribersWithNegativeBalance(Subscriber[] v);

}
