package challenge;

class Main{
    public static void main(String[] args) {
        Person client = Person.costumerData();
        Account acc = new Account(client);
        acc.displayInfo();
        acc.menu();
        
    }
}