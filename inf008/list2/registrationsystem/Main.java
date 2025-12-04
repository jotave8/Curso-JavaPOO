public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A01", "Joao");
        Student student2 = new Student("A02", "Victor", 21);
        Student student3 = new Student("A03", "Jotave", 21, "ADS");

        student1.display();
        student2.display();
        student3.display();
    }
}