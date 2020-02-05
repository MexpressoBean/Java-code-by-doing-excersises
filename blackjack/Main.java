/**********************************************************************************
* Name        : Kevin Ramirez
* Date        : 12/5/19
* Program Name: Blackjack
* Description : Vegas style blackjack game that starts with the player drawing
*               two cards at random.  Based on the total value(score) of the
*               cards, the player can choose to "hit" or "stay".
*               If the player hits, then a card is drawn and is added to the score.
*               If the players score is over 21, the game is over and the dealer
*               wins as the player is busted.  If the player chooses to stay, the
*               dealers turn starts.  The dealers cards and score is revealed.
*               The dealer can either choose to hit or stay like the player.
*               If the dealer hits and his score exceeds 21, the player wins.
*               If the dealer stays, both the player and the dealers scores are
*               displayed and whoever's score is closest to 21 without going over
*               wins the game. This program was coded while learning Java.
*
*               Resources used: http://programmingbydoing.com
*                               https://entertainment.howstuffworks.com/blackjack3.htm
*
***********************************************************************************/

import java.util.Scanner; // Used for the user input
import java.util.Random;  // Used for the generation of random numbers for the card values


public class Main
{
  public static void main(String[] args)
  {
    final int MAX_SCORE = 21;            // Constant - used to represent the winning score number
    final int DECK      = 2;             // Constant - used for the initial cards drawn
    int hitAr[]         = new int[DECK]; // Array - used to store the returned values from the hit() function when player chooses hit
    int dealerHitAr[]   = new int[DECK]; // Array - used to store the returned values from the hit() function when dealer chooses hit
    int playerCards[]   = new int[DECK]; // Array - used to hold the values of the players two cards
    int dealerCards[]   = new int[DECK]; // Array - used to hold the values of the dealers two cards
    int dealerNewCard   = 0;             // Int - used to hold the value of the a new card drawn by the dealer
    int newCard         = 0;             // Int - used to hold the value of the a new card drawn by the player
    int playerScore     = 0;             // Int - used to store the value of the players score
    int dealerScore     = 0;             // Int - used to store the value of the dealers score
    boolean dealersTurn = false;         // Bool - used to indicate the start of the dealers turn
    Scanner in = new Scanner(System.in); // Input - used for user input: menu choices (hit or stay)
    String playerChoice;                 // String - used to store the value of the users menu choice (hit or stay)


    // Main header
    // introduces the player to the game
    System.out.print("Welcome to my blackjack program!\n\n");


    // Player dealt 2 starting cards
    playerCards = draw(); // Draws two cards for the player
    playerScore = updateScore(playerScore, playerCards);


    System.out.println("You got " + playerCards[0] + " and " + playerCards[1] + ".");
    System.out.print("Your total is " + playerScore + ". \n\n");

    // Dealer dealt 2 starting cards
    dealerCards = draw(); // Draws two cards for the dealer, displays one, the other is hidden
    dealerScore = updateScore(dealerScore, dealerCards);


    // dealerCards[1] will always be the hidden card
    System.out.print("Dealer has a " + dealerCards[0] + " showing, and a hidden card." + "\n");
    System.out.print("Dealer total is hidden.\n\n");


    // loop handles the players hit/stay choices
    do
    {
      System.out.print("Would you like to \"hit\" or \"stay\"? ");
      playerChoice = in.nextLine();

      // Player chooses to hit
      if(playerChoice.equals("hit"))
      {
        hitAr = hit(playerScore);
        playerScore = hitAr[0];
        newCard = hitAr[1];

        System.out.print("\nYou drew a " + newCard + ". \n");
        System.out.print("Your total is " + playerScore + "\n\n");

        // Determines if the player has won or lost
        if(playerScore == MAX_SCORE)
        {
          System.out.print("YOU WIN!!\n");
          break;
        }
        else if(playerScore > MAX_SCORE)
        {
          System.out.print("Dealer wins. You busted...\n");
          break;
        }

      }
      else if(playerChoice.equals("stay")) // Player chooses to stay
      {
        dealersTurn = true;

        // Dealers turn after the player stays
        System.out.print("\nOkay, dealer's turn.\n");
        System.out.print("The dealer's hidden card was a " + dealerCards[1] + ".\n");
        System.out.print("The dealer's total was " + dealerScore + "\n\n");

        break; // breaks out of the loop
      }
      else
      {
        // data validation for user input
        System.out.print("Error - invalid input\n");
      }
    }while(playerScore < MAX_SCORE);


    // once the player chooses to stay, this code block is executed
    // this handles the dealer moves, finishes off the game and determines a winner
    if(dealersTurn == true)
    {
      // the dealer will always hit if his score is less than 16
      while(dealerScore < 16)
      {
        System.out.print("Dealer chooses to hit.\n");

        dealerHitAr = hit(dealerScore);
        dealerScore = dealerHitAr[0];
        dealerNewCard = dealerHitAr[1];

        System.out.print("\nDealer drew a " + dealerNewCard + ". \n");
        System.out.print("Dealer total is " + dealerScore + "\n\n");
      }

      // dealer chooses to stay when his score is greater than or equal to 16
      if(dealerScore >= 16)
      {
        // if dealer is busted, "Dealer stays" will not be output as the dealer has
        // already lost the game
        if(dealerScore < MAX_SCORE)
        {
          System.out.print("Dealer stays.\n\n");
        }

        // outputs the two scores
        System.out.print("Your score is  : " + playerScore + "\n");
        System.out.print("Dealer score is: " + dealerScore + "\n");

        // determines the winner of the game based on the two scores
        if(playerScore > dealerScore)
        {
          System.out.print("\nYOU WIN!!\n");
        }
        else
        {
          if(dealerScore <= MAX_SCORE)
          {
            System.out.print("\nDealer wins. \n");
          }
          else
          {
            System.out.print("\nYOU WIN!! Dealer busted.\n");
          }
        }
      }
    }

  } // END main()



  //-------------------------- Funtions --------------------------------------------------------



  // function that handles player card draws, will generate two cards for the player
  // function will get values for card 1 and 2 and output the cards
  // function returns an array of integers with 2 spaces for the two cards
  static int[] draw()
  {
    int card1 = getRandomNum();
    int card2 = getRandomNum();

    return new int[] {card1, card2};
  } // END draw



  // function that handles the hit option: draws a card and adds to the score
  // returns an array that stores the new card in [1] and the updated score in [0]
  static int[] hit(int score)
  {
    // ar[0] is the updated score
    // ar[1] is the new card drawn
    int[] ar = new int[2];

    ar[1] = getRandomNum(); // ar[1] gets the value of a new card drawn
    score = score + ar[1];  // score is updated to include the new card
    ar[0] = score;          // the score is stored into ar[0] to be returned out of the function

    return ar;              // ar is returned
  } // END hit



  // function that adds adds the two cards together and updates the score
  // function returns an int, score
  static int updateScore(int score, int[] cards)
  {
    int addedCardScore = (cards[0] + cards[1]);
    score = score + addedCardScore;

    return score;
  } // END updateScore



  // function that generates a random number between 1 and 11
  // returns an int (random number)
  static int getRandomNum()
  {
    final int MAX = 11; // Max number that will be produced
    final int MIN = 1;  // Min number that will be produced
    Random randomNumber = new Random();
    int rand = randomNumber.nextInt((MAX - MIN) + 1) + MIN;

    return rand;
  } // END getRandomNum

} // END public class Main
