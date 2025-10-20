import java.util.Scanner;
import java.util.Random;

class Guesswork{
    public static void main(String argd[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        int number = random.nextInt(100);
        System.out.println("You have " + attempts + " attempts to guess a number from 0 to 100");
        while (attempts > 0){
            System.out.println("\nEnter a number: ");
            int choice = scanner.nextInt();
            if (choice > 100 || choice < 0){
                System.out.println("Invalid number, please enter a number between 0 and 100.");
            }else{
                attempts--;
                if (choice == number){
                    System.out.println("Congratulations!! You guessed the number");
                }else{
                    if (attempts > 0){
                        System.out.println("Sorry, this is not the correct number, please try again. You have " + attempts + " attempts");
                    }else{
                        System.out.println("Your attempts are over. The correct number is " + number);
                    }
                }
            }
           
        }
    }
}