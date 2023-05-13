package lesson004;

public class Car {
    private double consumption;
    private double tankVolume;
    private double leftoverFuel;

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setLeftoverFuel(double leftoverFuel) {
        this.leftoverFuel = leftoverFuel;
    }

    public double getConsumption() {
        return this.consumption;
    }

    public double getLeftoverFuel() {
        return this.leftoverFuel;
    }

    public double getTankVolume() {
        return this.tankVolume;
    }

    public double fillTheTank(){
        double refill = tankVolume-leftoverFuel;
        leftoverFuel = tankVolume;
        return refill;
    }

    public double leftoverAfterTrip(double tripKm){
        leftoverFuel-=(this.consumption*(tripKm/100));
        return leftoverFuel;
    }

    public double needToFill(double distance){
        double leftover = leftoverFuel-(distance*(this.consumption/100));
        if (leftover<0){
            return leftover*(-1);
        }
        else return 0;
    }
}
