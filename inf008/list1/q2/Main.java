package q2;

public class Main{
    public static void main(String[] args) {
        CashRegister person1 = new CashRegister (2000.50, 2);
        CashRegister person2 = new CashRegister (3, "Jota");
        CashRegister person3 = new CashRegister ("Victor", 3659.00);

        person1.processPayment(500);
        person2.processRefund(300);
        person3.processPayment(100);

        System.out.println(person1.getDailyReport());
        System.out.println(person2.getDailyReport());
        System.out.println(person3.getDailyReport());
    }
}