import java.util.Scanner;
import java.util.Random;

class RandomNumber {

    int RandomNumber;

    public int RandomNo() {

        // Creating instance of Random class
        Random r = new Random();
        System.out.println("________THE GAME HAS STARTED________");
        System.out.println();
        System.out.println("A RANDOM NUMBER HAS BEEN GENERATED, GUESS THE NUMBER IN 5 ATTEMPTS TO WIN THE GAME");

        // Random number generated in the Range 0-50
        RandomNumber = r.nextInt(50);
        return RandomNumber;
    }
}

class Decider {

    int Random;
    int Guessed;

    public void CollectNumbers() {

        RandomNumber ob1 = new RandomNumber();
        // Player ob2 = new Player();

        Random = ob1.RandomNo();
    }

    public void compare() {
        int count = 0;
        int attempts = 5;
        for (int i = 0; i < 5; i++) {

            // Creating instance of Scanner Class
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("Enter your guess");
            Guessed = scan.nextInt();
            count++;

            if (Random == Guessed && Guessed <= 50) {
                System.out.println();
                System.out.println("CORRECT ANSWER !! YOU WIN !!");
                System.out.println("Number of Attempts taken = " + count);
                break;

            } else if (Random != Guessed && Guessed <= 50) {
                attempts--;
                System.out.println();
                System.out.println("WRONG GUESS !!");
                System.out.println("Number of Attempts Left = " + attempts);
                continue;

            } else {
                attempts--;
                System.out.println();
                System.out.println("Your Guess is Out of Range");
                System.out.println("Number of attempts left = " + attempts);
            }
            scan.close();
        }

        if (attempts == 0) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("   YOU HAVE LOST THE GAME:(   ");
            System.out.println();
            System.out.println("Correct Number was " + Random);
        }
    }
}

public class GuesserGame {
    public static void main(String ar[]) {
        Decider obj = new Decider();
        obj.CollectNumbers();
        obj.compare();
    }
}
