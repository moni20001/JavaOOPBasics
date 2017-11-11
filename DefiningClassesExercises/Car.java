package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car{
    private String brand;
    private Integer EngineSpeed;
    private Integer EnginePower;
    private Integer CargoWeight;
    private String typeCargo;
    private double tire1Pressure;
    private int tire1Age;
    private double tire2Pressure;
    private int tire2Age;
    private double tire3Pressure;
    private int tire3Age;
    private double tire4Pressure;
    private int tire4Age;

    public Car(String brand, Integer engineSpeed, Integer enginePower, Integer cargoWeight, String typeCargo, double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        this.brand = brand;
        EngineSpeed = engineSpeed;
        EnginePower = enginePower;
        CargoWeight = cargoWeight;
        this.typeCargo = typeCargo;
        this.tire1Pressure = tire1Pressure;
        this.tire1Age = tire1Age;
        this.tire2Pressure = tire2Pressure;
        this.tire2Age = tire2Age;
        this.tire3Pressure = tire3Pressure;
        this.tire3Age = tire3Age;
        this.tire4Pressure = tire4Pressure;
        this.tire4Age = tire4Age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split("\\s+");
            Car car = new Car(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],Double.parseDouble(arr[5]),Integer.parseInt(arr[6])
            ,Double.parseDouble(arr[7]),Integer.parseInt(arr[8]),Double.parseDouble(arr[9]),Integer.parseInt(arr[10]),Double.parseDouble(arr[11]),Integer.parseInt(arr[12]));
            cars.add(car);
        }
        String command = scan.nextLine();
       if(command.equals("fragile")){
           cars.stream().filter(a -> a.typeCargo.equals(command)).filter(a -> a.tire1Pressure<1 || a.tire2Pressure<1 || a.tire3Pressure<1 || a.tire4Pressure<1).forEach(
                   a -> {
                       System.out.println(a.brand);
                   }
           );
       }
       else{
           cars.stream().filter(a -> a.typeCargo.equals(command)).filter(a -> a.EnginePower>250).forEach(
                   a -> {
                       System.out.println(a.brand);
                   }
           );
       }

}}
