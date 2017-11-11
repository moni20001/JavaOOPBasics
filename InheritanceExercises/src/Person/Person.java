package Person;

public  class Person {
    private String name;
    private int age;

    protected void setAge(Integer age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }

        this.age = age;
    }

    private void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }

        this.name = name;
    }

    public Person(String name, int age)throws IllegalArgumentException {
      this.setName(name);
      this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return sb.toString();
    }
}

