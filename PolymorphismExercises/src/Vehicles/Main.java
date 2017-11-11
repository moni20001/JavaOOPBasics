package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] carArr = scan.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carArr[1]),Double.parseDouble(carArr[2]),Double.parseDouble(carArr[3]));
        String[] truckArr = scan.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckArr[1]),Double.parseDouble(truckArr[2]),Double.parseDouble(truckArr[3]));

        String[] busArr = scan.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busArr[1]),Double.parseDouble(busArr[2]),Double.parseDouble(busArr[3]));
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tempArr = scan.nextLine().split("\\s+");
            switch (tempArr[0]){
                case "Drive":
                    try{
                    if(tempArr[1].equals("Car")){
                        car.drive(Double.parseDouble(tempArr[2]));
                    }
                    else if(tempArr[1].equals("Bus")){
                        bus.drive(Double.parseDouble(tempArr[2]));
                    }
                    else{
                        truck.drive(Double.parseDouble(tempArr[2]));
                    }}catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    try{
                        bus.drive(Double.parseDouble(tempArr[2]));
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }

                    break;
                case "Refuel":
                    try {
                        if (tempArr[1].equals("Car")) {
                            car.refuel(Double.parseDouble(tempArr[2]));
                        } else if (tempArr[1].equals("Bus")) {
                            bus.refuel(Double.parseDouble(tempArr[2]));
                        } else {
                            truck.refuel(Double.parseDouble(tempArr[2]));
                        }
                        break;
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }


}
