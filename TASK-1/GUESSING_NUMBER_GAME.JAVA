import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 50; 
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0,max_attempts=15; 
        while (attempts<=max_attempts) 
		{
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == secretNumber) 
			{
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
		break;
            } 
			else if (userGuess < secretNumber) 
			{
                System.out.println("Try a higher number.");
            } 
			else 
			{
                System.out.println("Try a lower number.");
            }
        }
        scanner.close();
    }
}
