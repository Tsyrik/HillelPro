package lesson004;

public class Main {

    static Car myCar;

    static double[] trip = {179, 153, 148};

    static double gasPrice;

    public static void main(String[] args) {

        gasPrice = Double.parseDouble(args[0]);

        myCar = new Car();
        myCar.setTankVolume(60);
        myCar.setConsumption(12);
        myCar.setLeftoverFuel(32);

        double needToFillByTrip = tripCalc(trip, myCar);

        double totalCost = needToFillByTrip * gasPrice;

        System.out.println("During the trip we need to fill liters of gas: " + needToFillByTrip);
        System.out.println("Gas cost will be UAH : " + totalCost);

    }

    private static double tripCalc(double[] trip, Car car) {
        double needToFillByTrip = 0;
        for (double tripPart : trip) {
            if (car.leftoverAfterTrip(tripPart) < 0) {
                needToFillByTrip += car.needToFill(tripPart);
            }
        }
        return needToFillByTrip;
    }
}
