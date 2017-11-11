package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private double money;
    private List<String> products;

    Person(String name, double money) {
        setMoney(money);
        setName(name);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product p){
        if(p.getCost()<=this.money){
            setMoney(this.money - p.getCost());
            products.add(p.getName());
            System.out.printf("%s bought %s\n",this.name,p.getName());
        }
        else{
            System.out.printf("%s can't afford %s\n",this.name,p.getName());
        }
    }

    public List<String> getProducts() {
        return products;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    String getName() {
        return name;
    }
}
