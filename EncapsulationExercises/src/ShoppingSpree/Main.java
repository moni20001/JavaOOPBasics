package ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Person> mapPerson = new LinkedHashMap<>();
        Map<String,Product> productMap = new HashMap<>();
        String[] persArr = scan.nextLine().split(";");
        for (String s: persArr) {
            try{
                String[] temp = s.split("=");
                Person person = new Person(temp[0],Integer.parseInt(temp[1]));
                mapPerson.putIfAbsent(person.getName(),person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }

        }
        String[] productsArr = scan.nextLine().split(";");
        for (String s: productsArr) {
            try{
                String[] temp = s.split("=");
                Product product = new Product(temp[0],Double.parseDouble(temp[1]));
                productMap.putIfAbsent(product.getName(),product);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }

        }
        while (true){
            String line = scan.nextLine();
            if(line.equals("END")){
                break;
            }
            String[] tokens = line.split("\\s+");
            Person person = mapPerson.get(tokens[0]);
            Product product = productMap.get(tokens[1]);
            try {
                person.buyProduct(product);
            }catch (Exception e){ }
        }
        for (Map.Entry<String,Person> p: mapPerson.entrySet()) {
            Person person = p.getValue();
            if(person.getProducts().size() == 0){
                System.out.printf("%s - Nothing bought",person.getName());
            }
            else{
                List<String> list = person.getProducts();

                System.out.printf("%s - %s\n",person.getName(),list.toString().replaceAll("[\\]\\[]",""));
            }
        }
    }
}
