package AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        try{
            Chicken c = new Chicken(name,age);
            System.out.println(c.toString());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
