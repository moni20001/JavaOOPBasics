package AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;
    private double perDay;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
        setPerDay();
    }

    private void setPerDay() {
       if(this.age<6){
           this.perDay =  2;
       }
       else if(age <=12){
           this.perDay = 1;
       }
       else{
           this.perDay = 0.75;
       }
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if(age>=0 && age <=15) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.##");
        return String.format("Chicken %s (age %s) can produce %s eggs per day.",this.name,this.age,format.format(this.perDay));
    }
}
