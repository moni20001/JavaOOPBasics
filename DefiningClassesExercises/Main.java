package Exercises;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.lang.reflect.Constructor;
        import java.lang.reflect.Field;
        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;
        import java.util.Scanner;

public class Main {
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
