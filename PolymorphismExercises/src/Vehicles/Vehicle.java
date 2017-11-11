package Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumation;
    private double distanceTraveled;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumation, double tankCapacity) {
        this.setDistanceTraveled(0);
        this.setFuelConsumation(fuelConsumation);
        this.setFuelQuantity(fuelQuantity);
        setTankCapacity(tankCapacity);
    }

    public void setTankCapacity(double tankCapacity) {

        this.tankCapacity = tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    private void setFuelConsumation(double fuelConsumation) {
        this.fuelConsumation = fuelConsumation;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    protected void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }
    void refuel(double refuelQuantity) {
        if(refuelQuantity <=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(refuelQuantity>getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = (this.fuelQuantity + refuelQuantity);
    }
    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.fuelQuantity);
    }

    public double getFuelConsumation() {
        return fuelConsumation;
    }

    public abstract void drive(double distance);

}
