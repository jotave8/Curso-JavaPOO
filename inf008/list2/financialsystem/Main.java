public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345-6", "CORRENTE");
        account1.deposit(500.0);
        account1.deposit(200.0, "Salary");

        BankAccount account2 = new BankAccount("98765-4", "POUPANCA", 1000.0);
        account2.deposit(300.0);
        account2.deposit(150.0, "Gift");
    }
}