package q1;

public class Main{
    public static void main(String[] args) {
        Contact contact1 = new Contact("João","71925627667","joao@email.com");
        Contact contact2 = new Contact("Maria","71925627557");

        System.out.println(contact1.displayInfo());
        System.out.println(contact2.displayInfo());

        contact1.updateContact("71984298995","joao777@email.com");
        System.out.println(contact1.displayInfo());
    }
}