package challenge;
import java.util.Scanner;


public class Person {
    private String name;
    private double balance;
    private String accountType;

    public Person(String name, double balance, String accountType){
        this.name = name;
        this.balance  = balance;
        this.accountType = accountType;
    }

    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return accountType;
    }

    public static Person costumerData (){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the client name: ");
        String name = read.nextLine();
        System.out.print("Enter the account type: ");
        String accountType = read.nextLine();
        System.out.print("Enter the account balance: ");
        double balance = read.nextDouble();
        Person client = new Person(name, balance, accountType);
        return client;
    }
}