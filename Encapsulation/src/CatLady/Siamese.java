package CatLady;

public class Siamese extends Cat{
    private String name;
    private String earSize;


    public Siamese(String name, String earSize) {
        super(name);
        this.name = name;
        this.earSize = earSize;
        super.type = "Siamese";
    }

    @Override
    public String toString() {
        return "Siamese " + this.name + " "+ String.format("%.2f",Double.parseDouble(this.earSize));
    }
}
