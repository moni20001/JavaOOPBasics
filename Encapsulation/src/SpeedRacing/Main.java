package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Car> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split("\\s+");
            Car temp = new Car(arr[0],Integer.parseInt(arr[1]),Double.parseDouble(arr[2]));
            map.putIfAbsent(temp.getModel(),temp);

        }
        while (true){
            String line = scan.nextLine();
            if(line.equals("End")){
                break;
            }
            String[] arr = line.split("\\s+");
            Car temp = map.get(arr[1]);
            try {
                temp.drive(Integer.parseInt(arr[2]));
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        for (Map.Entry c:map.entrySet()) {
            Car t = (Car) c.getValue();
            System.out.printf("%s %.2f %.0f\n",c.getKey(),t.getFuel(),t.getDistanceTraveled());
        }
    }
}
