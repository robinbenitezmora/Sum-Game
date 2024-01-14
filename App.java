import java.util.Random;
import java.util.Scanner;

public class App {
 public static void main(String[] args) {
  Random random = new Random();
  int number = random.nextInt(99) + 2;
  try (Scanner scanner = new Scanner(System.in)) {
   int totalGuesses = 0;
   boolean continuePlaying = true;
   while (continuePlaying) {
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Can you guess what it is?");
    int guess = -1;
    int totalRandomNumbers = 0;
    while (guess != number) {
     System.out.print("Type a number: ");
     guess = scanner.nextInt();
     totalGuesses++;
     if (guess < number) {
      System.out.println("Too low!");
     } else if (guess > number) {
      System.out.println("Too high!");
     }
    }
    System.out.println("You got it!");
    totalRandomNumbers++;
    System.out.println("You have guessed after " + totalGuesses + " tries.");
    System.out.println("Would you like to play again? (y/n)");
    String answer = scanner.next();
    if (answer.equals("n")) {
     continuePlaying = false;
     System.out.println("You total score is " + totalRandomNumbers);
    }
   }
  }
 }
}
