package lesson007;

public class Main {

    public static void main(String[] args) {
        SubscriberServiceImpl subGenServ = new SubscriberServiceImpl();

        Subscriber[] subs = new Subscriber[3];
        subs[0] = new Subscriber(1, "Antonenko", "Anton", "Dnipro", "+380661234567",
                "+380667654321", 550, 50, 0, 100);
        subs[1] = new Subscriber(2, "Vladimyrenko", "Vladimyr", "Kiev", "+380932345678",
                "+380938765432", -333, 100, 10, 10);
        subs[2] = new Subscriber(3, "Dmytryenko", "Dmytro", "Kiev", "+380633456789",
                "+380639876543", 10.5, 0, 30, 30);

        System.out.println("Абоненти, у яких час внутрішньоміських розмов перевищує заданий: ");
        subGenServ.infoSubscriberLimitExceeded(subs, 100);
        System.out.println("\nАбоненти, які користувалися міжміським зв'язком:");
        subGenServ.usedInternationalCalls(subs, 0);
        System.out.println("\nАбоненти де перший бука <U>: ");
        subGenServ.subscriberDataSearchByLetter(subs, 'U');
        System.out.println("\nСумарне споживання трафіку інтернету");
        subGenServ.totalTrafficForTheCity(subs, "Kiev");
        System.out.println("\nКількість абонентів з негативним балансом");
        subGenServ.subscribersWithNegativeBalance(subs);

    }
}
