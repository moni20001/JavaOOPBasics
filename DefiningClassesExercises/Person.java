package Exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;


    public Person() {
       this(1);
    }
    public Person(int n){
        this("No name", n);
    }
    public Person(String name,int n){
        this.name = name;
        this.age = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   // public static void main(String[] args) throws Exception {
   //     InputStreamReader isr = new InputStreamReader(System.in);
   //     BufferedReader reader = new BufferedReader(isr);
   //     Class personClass = Person.class;
   //     Constructor emptyCtor = personClass.getDeclaredConstructor();
   //     Constructor ageCtor = personClass.getDeclaredConstructor(int.class);
   //     Constructor nameAgeCtor = personClass
   //             .getDeclaredConstructor(String.class, int.class);
//
   //     String name = reader.readLine();
   //     int age = Integer.parseInt(reader.readLine());
//
   //     Person basePerson = (Person) emptyCtor.newInstance();
   //     Person personWithAge = (Person) ageCtor.newInstance(age);
   //     Person personFull = (Person) nameAgeCtor.newInstance(name, age);
//
   //     System.out.printf("%s %s%n", basePerson.getName(), basePerson.getAge());
   //     System.out.printf("%s %s%n", personWithAge.getName(), personWithAge.getAge());
   //     System.out.printf("%s %s%n", personFull.getName(), personFull. getAge());
   // }


    //Poll
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String cmd = scan.nextLine();
            String[] arg = cmd.split("\\s+");
            String name = arg[0];
            int age = Integer.parseInt(arg[1]);
            Person temp = new Person(name,age);
            personList.add(temp);
        }
        personList.stream().filter(a -> a.getAge() >30).sorted(Comparator.comparing(a -> a.getName())).forEach(a ->{
            System.out.printf("%s - %s\n",a.getName(),a.getAge());
        });
    }
}


