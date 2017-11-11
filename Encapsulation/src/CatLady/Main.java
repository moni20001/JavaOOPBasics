package CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Cat> map = new HashMap<>();
        while (true){
            String line = scan.nextLine();
            if(line.equals("End")){
                break;
            }
            String[] tokens = line.split("\\s+");
            Cat cat = new Cat(tokens[0]);
            switch (tokens[0]){
                case "Cymric":
                     cat = new Cymric(tokens[1],tokens[2]);
                    break;
                case "Siamese":
                   cat = new Siamese(tokens[1],tokens[2]);
                    break;
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(tokens[1],tokens[2]);
                    break;
            }
            map.put(cat.getName(),cat);
        }
        String t = scan.nextLine();
        Cat temp = map.get(t);
        System.out.println(temp.toString());
    }
}
