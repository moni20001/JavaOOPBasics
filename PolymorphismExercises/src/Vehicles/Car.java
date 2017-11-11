package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{

    public Car(double fuelQuantity, double fuelConsumation, double tankCapacity) {
        super(fuelQuantity, fuelConsumation+0.9,tankCapacity);
    }
    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * super.getFuelConsumation();
        if (this.getFuelQuantity() < fuelNeeded) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        super.setDistanceTraveled(distance);
        setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(
                String.format("%s travelled %s km",
                        this.getClass().getSimpleName(),
                        df.format(distance)
                )
        );
}}
