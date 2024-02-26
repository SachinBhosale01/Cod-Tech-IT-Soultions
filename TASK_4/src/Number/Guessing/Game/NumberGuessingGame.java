package Number.Guessing.Game;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int targetNumber = random.nextInt(100)+1;
		int attempts =0;
		boolean hasGuessedCorrectly = false;
		
		System.out.println("Welcom to the Number Guessing Game!");
		System.out.println("Try to guess the number between 1 and 100");
	
		while (attempts<10) {
			System.out.print("\nEnter your guess: ");
			int guess = scanner.nextInt();
			attempts++;
			
			if(guess==targetNumber) {
				hasGuessedCorrectly = true;
				break;
			}else if(guess < targetNumber) {
				System.out.println("Too low! Try again");
			}else {
				System.out.println("Too high! Try again");
			}
			
		}
		if(hasGuessedCorrectly) {
			System.out.println("Congratulations! You guedded the number in "+ attempts+" attempts.");
		}else {
			System.out.println("Sorry! You've run out of attempts. The correct number was: "+targetNumber);
		}
	}

}
