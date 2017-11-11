package Lab;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while(!command.equals("End")){
            String[] arr = command.split("\\s+");
            switch (arr[0]){
                case "Create":
                    cmdCreate(arr,accounts);
                    break;
                case "Deposit":
                    cmdDeposit(arr,accounts);
                    break;
                case "Withdraw":
                    cmdWithdraw(arr,accounts);
                    break;
                case "Print":
                    cmdPrint(arr,accounts);
                    break;
            }
            command =  scan.nextLine();
        }
    }

    private static void cmdPrint(String[] arr, HashMap<Integer, BankAccount> accounts) {
        if(!accounts.containsKey(Integer.valueOf(arr[1]))){
            System.out.println("Account does not exist");
        }
        else {
            int id = Integer.parseInt(arr[1]);
            BankAccount temp = accounts.get(id);
            System.out.printf("Account %s, balance %.2f\n",temp,temp.getBalance());

        }
    }

    private static void cmdWithdraw(String[] arr, HashMap<Integer, BankAccount> accounts) {
        if(!accounts.containsKey(Integer.valueOf(arr[1]))){
            System.out.println("Account does not exist");
        }
        else{
            int id = Integer.parseInt(arr[1]);
            BankAccount temp = accounts.get(id);
            if(Integer.valueOf(arr[2]) > temp.getBalance()){
                System.out.println("Insufficient balance");
            }
            else{
                temp.withdraw(Integer.valueOf(arr[2]));
            }
        }
    }

    private static void cmdDeposit(String[] arr, HashMap<Integer, BankAccount> accounts) {
        if(!accounts.containsKey(Integer.valueOf(arr[1]))){
            System.out.println("Account does not exist");
        }
        else{
            int id = Integer.parseInt(arr[1]);
            BankAccount temp = accounts.get(id);
            temp.deposit(Integer.parseInt(arr[2]));
            accounts.put(id,temp);
        }
    }

    private static void cmdCreate(String[] arr, HashMap<Integer, BankAccount> accounts) {
        if(accounts.containsKey(Integer.valueOf(arr[1]))){
            System.out.println("Account already exists");
        }
        else{
            BankAccount acc = new BankAccount();
            acc.setId(Integer.valueOf(arr[1]));
            accounts.put(Integer.valueOf(arr[1]),acc);
        }

    }
}
