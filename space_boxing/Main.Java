import java.util.Scanner;

// Kevin Ramirez
// http://programmingbydoing.com/a/space-boxing.html
// Space boxing

public class Main
{
  public static void main(String[] args)
  {
    Scanner intIn = new Scanner(System.in);
    Scanner doubleIn = new Scanner(System.in);
    double earthWeight = 0;
    double spaceWeight = 0;
    int planet = 0;

    System.out.print("Please enter your current earth weight: ");
    earthWeight = doubleIn.nextDouble();

    System.out.print("\n");
    System.out.print("I have information for the following planets: \n");
    System.out.print("  1. Venus   2. Mars    3. Jupiter \n");
    System.out.print("  4. Saturn  5. Uranus  6. Neptune \n\n");

    System.out.print("Which planet are you visiting? ");
    planet = intIn.nextInt();

    System.out.print("\n");
    spaceWeight = calcSpaceWeight(planet, earthWeight);

    System.out.println("Your weight would be " + spaceWeight + " pounds on planet #" + planet + ".");
  }



  // function that calculates the different weights on the various planets
  public static double calcSpaceWeight(int planet, double earthWeight)
  {
    final double venusGravity   = 0.78; // Planet 1
    final double marsGravity    = 0.39; // Planet 2
    final double jupiterGravity = 2.65; // Planet 3
    final double saturnGravity  = 1.17; // Planet 4
    final double uranusGravity  = 1.05; // Planet 5
    final double neptuneGravity = 1.23; // Planet 6
    double spaceWeight = 0;

    if(planet == 1)
    {
      spaceWeight = (earthWeight * venusGravity);
    }
    else if(planet == 2)
    {
      spaceWeight = (earthWeight * marsGravity);
    }
    else if(planet == 3)
    {
      spaceWeight = (earthWeight * jupiterGravity);
    }
    else if(planet == 4)
    {
      spaceWeight = (earthWeight * saturnGravity);
    }
    else if(planet == 5)
    {
      spaceWeight = (earthWeight * uranusGravity);
    }
    else
    {
      spaceWeight = (earthWeight * neptuneGravity);
    }

    return spaceWeight;
  }
}
