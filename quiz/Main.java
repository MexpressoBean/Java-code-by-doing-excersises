import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner quizInput = new Scanner(System.in);
    Scanner menuInput = new Scanner(System.in);
    int correctCount = 0;
    int incorrectCount = 0;
    int quizChoice = 0;
    double resultPrecentage;
    char menuChoice;


    System.out.println("Ready to take this quiz? (Y/N)");
    menuChoice = menuInput.next().charAt(0);

    if(menuChoice == 'Y' || menuChoice == 'y')
    {

      System.out.println("Okay, here it comes!\n\n");


      // Question 1
      System.out.print("Q1) What is the capital of California?\n");
      System.out.print("    1. Irvine     \n");
      System.out.print("    2. Los Angeles\n");
      System.out.print("    3. Sacremento \n\n");

      System.out.print("> ");
      quizChoice = quizInput.nextInt();

      if(quizChoice == 3)
      {
        System.out.print("\nThat's correct! \n\n");
        correctCount++;
      }
      else if(quizChoice == 2 || quizChoice == 1)
      {
        System.out.print("Incorrect... \n");
        incorrectCount++;
      }
      else
      {
        System.out.print("Invalid answer, this counts as incorrect. \n");
        incorrectCount++;
      }

      // // Question 2
      System.out.print("Q2) Is java a compiled or interpreted language?\n");
      System.out.print("    1. Compiled     \n");
      System.out.print("    2. Interpreted \n\n");

      System.out.print("> ");
      quizChoice = quizInput.nextInt();

      if(quizChoice == 1)
      {
        System.out.print("\nThat's correct! \n\n");
        correctCount++;
      }
      else if(quizChoice == 2)
      {
        System.out.print("Incorrect... \n\n");
        incorrectCount++;
      }
      else
      {
        System.out.print("Invalid answer, this counts as incorrect. \n\n");
        incorrectCount++;
      }


      // Question 3
      System.out.print("Q3) What team drafted Kobe Bryant?\n");
      System.out.print("    1. Lakers  \n");
      System.out.print("    2. Hornets \n");
      System.out.print("    3. 76ers   \n\n");

      System.out.print("> ");
      quizChoice = quizInput.nextInt();

      if(quizChoice == 2)
      {
        System.out.print("\nThat's correct! Kobe was drafted by the Hornets and then traded to the Lakers!\n\n");
        correctCount++;
      }
      else if(quizChoice == 1 || quizChoice == 3)
      {
        System.out.print("Incorrect... \n");
        incorrectCount++;
      }
      else
      {
        System.out.print("Invalid answer, this counts as incorrect. \n");
        incorrectCount++;
      }


      // Results
      resultPrecentage = (correctCount / 3.0) * 100;

      System.out.print("RESULTS:\n--------------------\n");
      System.out.print("You scored a " + resultPrecentage + "%\n");

      System.out.print("Correct  : " + correctCount   + " \n");
      System.out.print("Incorrect: " + incorrectCount + " \n");

    }
    else if(menuChoice == 'N' || menuChoice == 'n')
    {
      System.out.println("Okay ending program.");
    }
    else
    {
      System.out.println("Invalid - Ending program.");
    }

  }
}
