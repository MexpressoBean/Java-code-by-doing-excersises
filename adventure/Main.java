import java.util.Scanner;



public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String choice;

    // Starting scenario: You wake up in a house that you do not recognize
    // Structure (Start at R1, there are 8 possible endings):
    //          _ R1 _
    //         /      \
    //      R2          R3
    //     /  \        /  \
    //   R4    R5    R6    R7
    //   /\    /\    /\    /\
    // E1 E2 E3 E4 E5 E6 E7 E8
    //
    // R = Room
    // E = Ending

    // Story outline
    // R1 - starting point (wake up in bedroom upstairs)
    // R2 -

    System.out.print("WELCOME TO YOUR ADVENTURE!\n\n");

    // R1
    System.out.print("\"room 2\" or \"room 3\"? \n");
    System.out.print("> ");
    choice = input.nextLine();

    if(choice.equals("room 2"))
    {
      System.out.print("You chose room 2!  Now, \"room 4\" or \"room 5\" \n");
      System.out.print("> ");
      choice = input.nextLine();

      if(choice.equals("room 4"))
      {
        System.out.print("You chose room 4!  Now, \"ending 1\" or \"ending 2\" \n");
        System.out.print("> ");
        choice = input.nextLine();

        if(choice.equals("ending 1"))
        {
          System.out.print("You chose ending 1!\n\n");
        }
        else if(choice.equals("ending 2"))
        {
          System.out.print("You chose ending 2!\n\n");
        }
        else
        {
          System.out.print("Invalid\n");
        }
      }
      else if(choice.equals("room 5"))
      {
        System.out.print("You chose room 5!  Now, \"ending 3\" or \"ending 4\" \n");
        System.out.print("> ");
        choice = input.nextLine();

        if(choice.equals("ending 3"))
        {
          System.out.print("You chose ending 3!\n\n");
        }
        else if(choice.equals("ending 4"))
        {
          System.out.print("You chose ending 4!\n\n");
        }
        else
        {
          System.out.print("Invalid\n");
        }
      }
      else
      {
        System.out.print("Invalid\n");
      }

    }
    else if(choice.equals("room 3"))
    {
      System.out.print("You chose room 3!  Now, \"room 6\" or \"room 7\" \n");
      System.out.print("> ");
      choice = input.nextLine();

      if(choice.equals("room 6"))
      {
        System.out.print("You chose room 6!  Now, \"ending 5\" or \"ending 6\" \n");
        System.out.print("> ");
        choice = input.nextLine();

        if(choice.equals("ending 5"))
        {
          System.out.print("You chose ending 5!\n\n");
        }
        else if(choice.equals("ending 6"))
        {
          System.out.print("You chose ending 6!\n\n");
        }
        else
        {
          System.out.print("Invalid\n");
        }
      }
      else if(choice.equals("room 7"))
      {
        System.out.print("You chose room 7!  Now, \"ending 7\" or \"ending 8\" \n");
        System.out.print("> ");
        choice = input.nextLine();

        if(choice.equals("ending 7"))
        {
          System.out.print("You chose ending 7!\n\n");
        }
        else if(choice.equals("ending 8"))
        {
          System.out.print("You chose ending 8!\n\n");
        }
        else
        {
          System.out.print("Invalid\n");
        }
      }
      else
      {
        System.out.print("Invalid\n");
      }
    }
    else
    {
      System.out.print("Invalid\n");
    }
  }
}
