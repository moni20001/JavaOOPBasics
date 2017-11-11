package ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        try {
            Box box = new Box(l,w,h);
            System.out.printf("Surface Area - %.2f\n",box.surfaceArea());
            System.out.printf("Lateral Surface Area - %.2f\n",box.lateralSurfaceArea());
            System.out.printf("Volume - %.2f",box.volume());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
