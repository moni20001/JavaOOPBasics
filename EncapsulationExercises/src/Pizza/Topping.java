package Pizza;

public class Topping {
    private String type;
    private int weightInGrams;


    public Topping(String type, int weightInGrams) {
       setType(type);
       setWeightInGrams(weightInGrams);
    }

    private void setType(String type) {
        if(type.equals("Meat")||type.equals("Veggies")||type.equals("Cheese")||type.equals("Sauce")) {
            this.type = type;
        }
        else{
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",type));
        }
    }

    private void setWeightInGrams(int weightInGrams) {
        if(weightInGrams>=1 && weightInGrams <= 50) {
            this.weightInGrams = weightInGrams;
        }
        else{
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.type));
        }
    }
    public double getCalo(){
        double calories = this.weightInGrams*2;
        switch (this.type){
            case "Meat":
                calories *=1.2;
                break;
            case "Veggies":
                calories *=0.8;
                break;
            case "Cheese":
                calories *=1.1;
                break;
            case "Sauce":
                calories *=0.9;
                break;
        }
        return calories;
    }
}
