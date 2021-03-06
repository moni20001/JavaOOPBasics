public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String a1 , String a2 , int age,double salary){
        setFirstName(a1);
        setLastName(a2);
        setAge(age);
        setSalary(salary);

    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
       if(salary < 460){
           throw new IllegalArgumentException("Salary cannot be less than 460 leva");
       }
       this.salary = salary;
    }
    public  void increaseSalary(Double bonus){
        if(this.age>30){
            this.salary += this.salary * bonus /100;
        }
        else{
            this.salary += this.salary * bonus /200;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if(firstName.length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

         this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if(lastName.length()<3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }

            this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age <=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
            this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName+ " "+this.lastName + " gets " + this.salary +" leva";
    }
}
