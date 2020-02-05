import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int stepCount = 0;
    int rowCount = 0;
    int maxValue = 0;
    int startingNumber = 0;

    System.out.print("Starting number: ");
    startingNumber = in.nextInt();

    System.out.print(startingNumber + "  ");

    if(startingNumber > maxValue)
    {
      maxValue = startingNumber;
    }



    do
    {
      if(startingNumber > maxValue)
      {
        maxValue = startingNumber;
      }

      if(rowCount == 10)
      {
        System.out.print("\n");
        rowCount = 0;
      }

      if(startingNumber % 2 == 0)
      {
        // Even
        startingNumber = startingNumber / 2;

        System.out.print(startingNumber + "  ");
        stepCount++;
        rowCount++;
      }
      else
      {
        //Odd
        startingNumber = ((3 * startingNumber) + 1);
        System.out.print(startingNumber + "  ");
        stepCount++;
        rowCount++;
      }

    }while(startingNumber != 1);

    // 837799

    if(startingNumber == 1)
    {
      System.out.print("\n\nTerminated after " + stepCount + " steps. The largest value was " + maxValue + ".\n");
    }

  }
}
