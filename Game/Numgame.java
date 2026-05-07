import java.util.Random;
import java.util.Scanner;
public class Numgame {

        static int generateNumber(){
            Random rand = new Random();
            return rand.nextInt(100)+1;
        }

        static void checkGuess(int secret, int guess){
            if(guess> secret){
            System.out.println("Too high");
            }
            else if(guess < secret){
                System.out.println("Too low");
            }
            else{
                System.out.println("Correct");
            }

        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = generateNumber();
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a Number between 1 and 100");

        while(guess != secretNumber){
            System.out.println("Enter your guess No: ");

            guess = input.nextInt();

            attempts++;
            checkGuess(secretNumber, guess);
        }
         
        System.out.println("You won in "+ attempts+" attempts");
        
    }
}