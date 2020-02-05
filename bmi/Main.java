import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
  public static void main(String[] args)
  {
    DecimalFormat df = new DecimalFormat(".#");
    Scanner input = new Scanner(System.in);
    int inches = 0;
    int pounds = 0;
    double bmi = 0;

    System.out.print("Enter your height (in): ");
    inches = input.nextInt();

    System.out.print("Enter your weight (lbs): ");
    pounds = input.nextInt();

    bmi = calcBMI(inches, pounds);

    System.out.print("\nYour BMI is: " + df.format(bmi) + " \n");


    if(bmi >= 30.0)
    {
      System.out.println("BMI Category: obese");
    }
    else if(bmi <= 29.9 && bmi >= 25.0)
    {
      System.out.println("BMI Category: overweight");
    }
    else if(bmi <= 24.9 && bmi >= 18.5)
    {
      System.out.println("BMI Category: normal weight");
    }
    else if(bmi < 18.5 && bmi >= 0)
    {
      System.out.println("BMI Category: underweight");
    }
    else
    {
      System.out.println("ERROR - No category");
    }


    input.close();
  }


  public static double calcBMI(int inches, int pounds)
  {
    double bmiResult = (double)(703 * (pounds)) / (inches * inches);

    return bmiResult;
  }
}
