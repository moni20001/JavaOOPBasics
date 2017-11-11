package Exercises;

import java.util.*;

public class Employee {
    public static final String DEFAULT_EMAIL = "n/a";
    public static final int DEFAULT_AGE = -1;
    private String name;
    private double salary;
    private String email;
    private int age;
    private String position;
    private String department;

    public Employee(String name, double salary , String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = DEFAULT_AGE;
        this.email = DEFAULT_EMAIL;
    }
    public Employee(String name, double salary , String position, String department,String email) {
        this(name,salary,position,department);
        this.email = email;

    }
    public Employee(String name, double salary , String position, String department, int age) {
        this(name,salary,position,department);
        this.age = age;

    }
    public Employee(String name, double salary , String position, String department,String email, int age) {
        this(name,salary,position,department);
        this.age = age;
        this.email= email;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,List<Employee>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split("\\s+");
            Employee temp = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3]);
            switch (arr.length){
                case 4:
                   temp = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3]);
                   break;
                case 5:
                    if(arr[4].contains("@")){
                        temp = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3],arr[4]);
                    }
                    else{
                        temp = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3],Integer.parseInt(arr[4]));
                    }
                    break;
                case 6:
                    temp = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3],arr[4],Integer.parseInt(arr[5]));
                    break;

            }
            if(!map.containsKey(temp.getDepartment())){
                map.put(temp.getDepartment(),new ArrayList<>());
            }

                List<Employee> tempo = map.get(temp.getDepartment());
               tempo.add(temp);
                map.put(temp.getDepartment(),tempo);

        }
        map.entrySet()
                .stream()
                .sorted((d1,d2) -> Double.compare(
                        d2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                d1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()))
                .limit(1).forEach(a -> {
            System.out.println("Highest Average Salary: "+a.getKey());
            a.getValue().stream().sorted(((z1,z2) -> Double.compare(z2.getSalary(),z1.getSalary()))).forEach(b -> {
                System.out.printf("%s %.2f %s %s\n",b.getName(),b.getSalary(),b.getEmail(),b.getAge());
            });
        });
    }
}
