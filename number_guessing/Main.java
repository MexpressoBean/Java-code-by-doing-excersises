import java.util.Scanner;
import java.util.Random;

// random num ----- int x = 1 + r.nextInt(10);
public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int randomNum = 1 + rand.nextInt(10); // Random Number between 1 and 10
    int guess = 0;
    int guessCount = 0;

    System.out.print("I have chosen a number between 1 and 10. Try to guess it.\n");
    System.out.print("Your guess: ");
    guess = in.nextInt();
    guessCount++;

    if(guess == randomNum)
    {
      System.out.println("\nThat's right! You're a good guesser.");
      System.out.println("\nIt only took you " + guessCount + " tries.");
    }
    else
    {
      do
      {
        if(guess < 1 || guess > 10)
        {
          System.out.print("Error: invalid guess - please guess a number in between 1 and 10, this guess does not count.\n");
          System.out.print("Your guess: ");
          guess = in.nextInt();
        }
        else
        {
          System.out.println("That is incorrect. Guess again");
          System.out.print("Your guess: ");
          guess = in.nextInt();

          guessCount++;
        }

      }while(guess != randomNum);

      System.out.println("\nThat's right! You're a good guesser.");
      System.out.println("\nIt only took you " + guessCount + " tries.");
    }



    in.close();
  }
}
