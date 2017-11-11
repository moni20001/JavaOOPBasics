package CatLady;

public class Cymric extends Cat{
    private String name;
    private String furLenght;

    public Cymric(String name, String furLenght) {
        super(name);
        this.name = name;
        this.furLenght = furLenght;
        super.type = "Cymric";
    }

    @Override
    public String toString() {
        return "Cymric " + this.name + " "+ String.format("%.2f",Double.parseDouble(this.furLenght));
    }
}
