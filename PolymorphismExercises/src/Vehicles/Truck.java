package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle{


    public Truck(double fuelQuantity, double fuelConsumation, double tankCapacity) {
        super(fuelQuantity, fuelConsumation+1.6,tankCapacity);
    }
    public void drive(double distance) {
        double fuelNeeded = distance * super.getFuelConsumation() ;
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
        );}

    @Override
    void refuel(double refuleQuantity){
        if(refuleQuantity<= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        else if(refuleQuantity > this.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + refuleQuantity * 0.95 );
    }
}
