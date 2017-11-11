package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Engine> engines = new HashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] engineTokens = scan.nextLine().split("\\s+");
            Engine engine = new Engine(engineTokens[0],Integer.parseInt(engineTokens[1]));
            switch (engineTokens.length){
                case 3:
                    try{
                        int temp = Integer.parseInt(engineTokens[2]);
                        engine  = new Engine(engineTokens[0],Integer.parseInt(engineTokens[1]),temp);
                    }catch (Exception e){
                        engine  = new Engine(engineTokens[0],Integer.parseInt(engineTokens[1]),engineTokens[2]);
                    }
                    break;
                case 4:
                    engine  = new Engine(engineTokens[0],Integer.parseInt(engineTokens[1]),Integer.parseInt(engineTokens[2]),engineTokens[3]);
                    break;
            }
            engines.putIfAbsent(engine.getEngineModel(),engine);
        }
        int t = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] carTokens = scan.nextLine().split("\\s+");
            Car car = new Car(carTokens[0],engines.get(carTokens[1]));
            switch (carTokens.length){
                case 3:
                    try {
                        int temp = Integer.parseInt(carTokens[2]);
                        car = new Car(carTokens[0],engines.get(carTokens[1]),temp);
                    }catch (Exception e){
                        car = new Car(carTokens[0],engines.get(carTokens[1]),carTokens[2]);
                    }
                    break;

                case 4:
                    car = new Car(carTokens[0],engines.get(carTokens[1]),Integer.parseInt(carTokens[2]),carTokens[3]);
                    break;
            }
            cars.add(car);
        }
        for (Car car : cars) {

            System.out.println(car.toString());
        }
    }
}
