package Mankind;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }


    public void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.length()>=5 && facultyNumber.length()<=10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }
    protected void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }

        if (!(lastName.length() > 3)) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }

        super.lastName = lastName;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s%n" +
                        "Last Name: %s%n" +
                        "Faculty number: %s%n",
                this.getFirstName(),
                this.getLastName(),
                this.getFacultyNumber()));
        return sb.toString();
}

    public String getFacultyNumber() {
        return facultyNumber;
    }}
