package Lab1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<BankAccount> accountList = new LinkedList<>();
        while (!command.equals("End")) {
            String[] arr = command.split("\\s+");
            if (arr[0].equals("End")) {
                break;
            }

            switch (arr[0]) {
                case "Create":
                    BankAccount temp = new BankAccount();
                    accountList.add(temp);
                    System.out.printf("Account %s created\n", temp.toString());
                    break;

                case "Deposit":
                    try {
                        BankAccount acc = accountList.get(Integer.valueOf(arr[1]) - 1);
                        int n = Integer.parseInt(arr[2]);
                        accountList.get(Integer.valueOf(arr[1])-1).deposit(n);
                        System.out.printf("Deposited %s to %s\n", n, accountList.get(Integer.valueOf(arr[1]) - 1).toString());
                    } catch (Exception e) {
                        System.out.println("Account does not exist");
                        break;
                    }


                    break;
                case "GetInterest":
                    try {
                        BankAccount acc1 = accountList.get(Integer.valueOf(arr[1]) - 1);
                        double b = accountList.get(Integer.valueOf(arr[1]) - 1).getInterest(Integer.parseInt(arr[2]));
                        System.out.printf("%.2f\n", b);
                    } catch (Exception e) {
                        System.out.println("Account does not exist");
                        break;
                    }

                    break;

                case "SetInterest":
                    accountList.stream().forEach(a -> a.setInterest(Double.valueOf(arr[1])));

                    break;

            }

            command = scan.nextLine();
        }
    }
}
