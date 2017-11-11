package CatLady;

public class StreetExtraordinaire extends Cat{
    private String name;
    private String decibelsOfMeows;


    public StreetExtraordinaire(String name, String decibelsOfMeows) {
        super(name);
        this.name = name;
        this.decibelsOfMeows = decibelsOfMeows;
        super.type = "StreetExtraordinaire";
    }

    @Override
    public String toString() {
      return "StreetExtraordinaire " + this.name + " "+ String.format("%.2f",Double.parseDouble(this.decibelsOfMeows));
    }
}
