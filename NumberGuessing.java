import java.util.*;
import java.util.Random;
public class NumberGuessing{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int secretNumber = generateRandomNumber();
        int attempts = 0;
        int guess;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected number between 1 and 100");
        do {
            System.out.print("Enter your guess:");
            guess = sc.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid Guess! Guess the number between 1 and 100");
                continue;
            }
            attempts++;
            if (guess == secretNumber) {
                System.out.println("Correct! You guessed it in " +attempts+ "attempts");
            }
            else if (guess < secretNumber) {
                System.out.println("Too low!");
            }
            else{
                System.out.println("Too high!");
            }
        } while (guess != secretNumber);
        sc.close();
    }
    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
