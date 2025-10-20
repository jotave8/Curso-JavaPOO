package challenge;
import java.util.Scanner;

public class Bank {
    private String name;
    private double balance;
    private String accountType;

    public Bank(String name, double balance, String accountType){
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

    public static Bank costumerData (){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the client name: ");
        String name = read.nextLine();
        System.out.print("Enter the account type: ");
        String accountType = read.nextLine();
        System.out.print("Enter the account balance: ");
        double balance = read.nextDouble();
        Bank client = new Bank(name, balance, accountType);
        return client;
    }

    public void displayInfo(){
        System.out.println("\n****************************");
        System.out.println("Name: " + getName());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());
        System.out.println("****************************");
    }

    public void menu(){
        System.out.println("");
    }

    public static void main(String[] args) {
        Bank client = costumerData();
        client.displayInfo();
    }
}
