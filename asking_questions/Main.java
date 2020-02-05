import java.util.Scanner;

// Kevin Ramirez
// http://programmingbydoing.com/a/asking-questions.html
// Asking Questions

public class Main
{
  public static void main(String[] args)
  {
    Scanner intIn = new Scanner(System.in);
    Scanner doubleIn = new Scanner(System.in);
    int age    = 0;
    int feet   = 0;
    int inches = 0;
    double weight = 0;

    System.out.print("How old are you? ");
    age = intIn.nextInt();

    System.out.print("How many feet tall are you? ");
    feet = intIn.nextInt();

    System.out.print("And how many inches? ");
    inches = intIn.nextInt();

    System.out.print("How much do you weight? ");
    weight = doubleIn.nextDouble();


    System.out.println("So you're " + age + " old, " + feet + "'" + inches + "\"" + " tall and " + weight + " heavy.");




    intIn.close();
    doubleIn.close();
  }
}
