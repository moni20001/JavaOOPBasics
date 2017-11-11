package CarSalesman;

public class Engine {
    private String engineModel;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String engineModel, int power) {
        this.engineModel = engineModel;
        this.power = power;
    }
    public Engine(String engineModel, int power, int displacement) {
        this(engineModel,power);
        this.displacement = displacement;
    }

    public Engine(String engineModel, int power, String efficiency) {
        this(engineModel,power);
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, int power, int displacement, String efficiency) {
        this(engineModel,power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getDisplacement() {
        if(this.displacement  == 0.0){
            return "n/a";
        }
        return String.format("%s",displacement);
    }

    public String getEfficiency() {
        if(this.efficiency == null){
        return "n/a";
    }
        return this.efficiency;
    }

    public int getPower() {
        return power;
    }
}
