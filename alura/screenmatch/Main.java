public class Main {
    public static void main (String[] args){
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.yearRelease = 1970;
        myMovie.durationMinutes = 180;

        System.out.println(myMovie.name);
        System.out.println(myMovie.yearRelease);
    }
}