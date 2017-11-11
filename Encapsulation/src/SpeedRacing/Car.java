package SpeedRacing;

public class Car {
    private String model;
    private double fuel;
    private double costFuel;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost){
        this.model = model;
        this.fuel = fuelAmount;
        this.costFuel = fuelCost;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public boolean setFuel(double fuel) {
        boolean isOkay = true;
        if(fuel>this.fuel){
            isOkay =false;
            throw new IllegalArgumentException("Insufficient fuel for the drive");
        }
        this.fuel -= fuel;
        return isOkay;
    }

    public void drive(int km){
        double smg = km * costFuel;
        boolean s = setFuel(smg);
        if(s){
            this.distanceTraveled += km;
        }
    }

    public double getFuel() {
        return fuel;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }
}
