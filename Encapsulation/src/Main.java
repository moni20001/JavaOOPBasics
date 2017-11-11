import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Sort by name and age
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (sComp != 0) {
                return sComp;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }

        */


    //VALIDATION EXERCISES
/*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split("\\s+");
            String firstName = arr[0];
            String lastName = arr[1];
            int age = Integer.parseInt(arr[2]);
            double salary = Double.parseDouble(arr[3]);
            try {
                Person temp = new Person(firstName, lastName, age, salary);
                people.add(temp);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        double bonus = Double.parseDouble(reader.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
    */


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split("\\s+");
            String firstName = arr[0];
            String lastName = arr[1];
            int age = Integer.parseInt(arr[2]);
            double salary = Double.parseDouble(arr[3]);
            try {
                Person temp = new Person(firstName, lastName, age, salary);
                people.add(temp);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }

        Team team = new Team("MINIOR");
        for(Person p : people){
            team.addPlayer(p);
        }
        System.out.println("First team have " + team.getFirstTeam().size()+" players");
        System.out.println("Reserve team have " + team.getReverseTeam().size()+" players");
    }
}
