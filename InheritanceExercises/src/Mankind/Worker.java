package Mankind;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName,double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }
    double moneyPerHour() {
        double daySalary = this.weekSalary / 7.0;
        return daySalary / this.workHoursPerDay;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary<10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        if(workHoursPerDay>=1 && workHoursPerDay<=12) {
            this.workHoursPerDay = workHoursPerDay;
        }else {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
    }
}
