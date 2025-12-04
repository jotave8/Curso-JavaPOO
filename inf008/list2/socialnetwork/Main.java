public class Main{
    public static void main (String[] args){
        Post post1 = new Post("Humor","jvictor7");
        Post post2 = new Post("Gym", "jvictor7", false);

        post1.curtir();
        post2.curtir(5);
        post1.curtir(3);
        post2.curtir();

    }
}