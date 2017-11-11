package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        if(this.weight == 0){
            return "n/a";
        }
        return String.format("%s",this.weight);
    }

    public String getColor() {
        if(this.color==null){
            return "n/a";
        }
        return color;
    }

    @Override
    public String toString() {

        return String.format("%s:%n  %s:%n    Power: %s%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s",
               this.getModel(),engine.getEngineModel(),engine.getPower(),engine.getDisplacement(),engine.getEfficiency(),this.getWeight(),this.getColor());
    }
}
