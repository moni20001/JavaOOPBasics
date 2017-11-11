package Pizza;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private String name;
    private int numberOfTopics;
    private Dough dough;
    private List<Topping> toppings;



    public Pizza(String name, int numberOfTopics) {
        setName(name);
        setNumberOfTopics(numberOfTopics);
        this.toppings = new LinkedList<>();
    }

    private void setName(String name) {
        if(!name.trim().isEmpty() && name.length()<=15) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    private void setNumberOfTopics(int numberOfTopics) {
       if(numberOfTopics >= 0 && numberOfTopics<=10){
           this.numberOfTopics = numberOfTopics;
       }
       else{
           throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
       }
    }
    public void addDough(Dough dough){
        this.dough = dough;
    }
    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public int getNumberOfTopics() {
        return numberOfTopics;
    }
    public double calculateCalories(){
        double calories = this.dough.getCalories();
        for (Topping t: this.toppings) {
            calories += t.getCalo();
        }
        return calories;
    }

    public String getName() {
        return name;
    }

}
