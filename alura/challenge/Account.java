package challenge;
import java.util.Scanner;

public class Account{

    private Person client;

    public Account(Person client){
        this.client = client;
    }

    public void displayInfo(){
        System.out.println("\n****************************");
        System.out.println("Name: " + client.getName());
        System.out.println("Account Type: " + client.getAccountType());
        System.out.println("Balance: " + client.getBalance());
        System.out.println("****************************\n");
    }
    
    public void checkBalance(){
        System.out.println("Your balance is R$" + client.getBalance());
    }

    public void receiveValue(int value){
        client.setBalance(client.getBalance() + value);
        System.out.println("Now, your balance is R$" + client.getBalance());
    }

    public void transferValue(int value){
        // valida saldo suficiente (opcional)
        if(client.getBalance() >= value){
            client.setBalance(client.getBalance() - value);
            System.out.println("Transfer successful. New balance: R$" + client.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void menu(){
        Scanner read = new Scanner(System.in);
        int option = 0;

        while(option != 4){
            System.out.println("\nOperations\n");
            System.out.println("1- Check balance\n" +
                               "2- Receive value\n" +
                               "3- Transfer value\n" +
                               "4- Exit\n");
            System.out.print("Enter the desired option: ");
            option = read.nextInt();

            switch (option){
                case 1:
                    checkBalance();
                    break;
                case 2: {
                    System.out.print("Enter amount to receive: ");
                    int value = read.nextInt();
                    receiveValue(value);
                    break;
                }
                case 3: {
                    System.out.print("Enter amount to transfer: ");
                    int value = read.nextInt();
                    transferValue(value);
                    break;
                }
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        read.close();
    }
}