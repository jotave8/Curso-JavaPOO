package challenge;
import java.util.Scanner;

public class Account{
    public void displayInfo(){
        System.out.println("\n****************************");
        System.out.println("Name: " + getName());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());
        System.out.println("****************************\n");
    }

    public void menu(){
        System.out.println("Operations\n");
        System.out.println("1- Check balance\n" +
                           "2- Receive value\n" +
                           "3- Transfer value\n" +
                           "4- Exit\n");
        System.out.println("Enter the desired option:");

    }
}