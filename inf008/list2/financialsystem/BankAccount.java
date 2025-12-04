public class BankAccount {
    private String number;
    private double balance;
    private String type; // "CORRENTE" ou "POUPANCA"

    public BankAccount(String number, String type) {
        this.number = number;
        this.type = type;
        this.balance = 0.0;
    }

    public BankAccount(String number, String type, double initialBalance) {
        this(number, type);
        if (initialBalance >= 0) {
            this.balance = initialBalance;    
        }
    }

    public void deposit(double value){
        if (ValidateValue(value) != true){
            throw new IllegalArgumentException("Invalid value.\n");
        }
        this.balance = getBalance() + value; 
        System.out.print("Amount R$" + getBalance() + " was deposited.\n");
    }

    public void deposit(double value, String description){
        if (ValidateValue(value) != true){
            throw new IllegalArgumentException("Invalid value.\n");
        }
        this.balance = getBalance() + value; 
        System.out.print("Amount R$" + getBalance() + " was deposited for " + description + ".\n");

    }

    private boolean ValidateValue(double value) {
        return value > 0;
    }

    public double getBalance(){
        return balance;
    }
}