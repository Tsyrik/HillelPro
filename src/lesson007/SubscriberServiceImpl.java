package lesson007;


import java.util.ArrayList;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void infoSubscriberLimitExceeded(Subscriber[] subscribers, double limit) {

        for (Subscriber s : subscribers) {
            if (s.getCityCallDuration() > limit) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void usedInternationalCalls(Subscriber[] subscribers, double limit) {
        for (Subscriber s : subscribers) {
            if (s.getInterCityCallDuration() > limit) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void subscriberDataSearchByLetter(Subscriber[] subscribers, char symbol) {
        for (Subscriber s : subscribers) {
            if (s.getLastName().charAt(0) == symbol) {
                System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getPhoneNumber() +
                        " " + s.getBalance() + " UAH");
            }
        }
    }

    @Override
    public void totalTrafficForTheCity(Subscriber[] subscribers, String nameCity) {
        ArrayList<Double> par = new ArrayList<>();
        double traffic;
        for (Subscriber s : subscribers) {
            if (s.getCity().equals(nameCity)) {
                par.add(s.getInternetTrafficGB());
            }
        }
        traffic = par.stream().mapToDouble(Double::intValue).sum();
        System.out.println("The total amount of traffic used in " + nameCity + " " + traffic + " GB");
    }

    @Override
    public void subscribersWithNegativeBalance(Subscriber[] subscribers) {
        int quantity = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                quantity++;
            }
        }
        System.out.println("Customers with a negative balance " + quantity + " person");
    }
}

