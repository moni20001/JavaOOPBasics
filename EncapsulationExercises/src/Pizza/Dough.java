package Pizza;

import java.util.HashMap;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private int weightInGrams;
    private double calories;

    public Dough(String flourType, String bakingTechnique, int weightInGrams) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
         setWeightInGrams(weightInGrams);
    }

    private void setFlourType(String flourType) {
       if(flourType.equals("White") || flourType.equals("Wholegrain")){
           this.flourType = flourType;
       }
       else{
           throw new IllegalArgumentException("Invalid type of dough.");
       }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }
        else{
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeightInGrams(int weightInGrams) {
        if(weightInGrams>=1 && weightInGrams<=200){
            this.weightInGrams = weightInGrams;
        }
        else{
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double getCalories() {
        double doughtWeightCalo = this.weightInGrams * 2;
        switch (flourType){
            case "White":
                doughtWeightCalo *=1.5;
                break;
            case "Wholegrain":
                doughtWeightCalo *= 1.0;
                break;
        }
        switch (bakingTechnique){
            case "Crispy":
                doughtWeightCalo *= 0.9;
                break;
            case "Chewy":
                doughtWeightCalo *= 1.1;
                break;
            case "Homemade": //not needed
                doughtWeightCalo *= 1.0;
                break;
        }
        this.calories = doughtWeightCalo;
        return doughtWeightCalo;
    }
}
