// Kidus Degefu
// Kwdegefu18@ole.augie.edu
//OneCard.java
import java.util.Scanner;
public class OneCard{
	//Desc:	Play the game of OneCard.  The game has 2 players, the user and the computer.  The user is 
	//		dealt 1 card, the computer is dealt 1 card.  The user has the option to change the card once.  
	//		The winner is the player with the higher rank card (Ace>King>Queen>…>3>2).  The suit is 
	//		not relevant.
	//Input:The user enters a character (Y/N) signaling whether the user wants to change the card.
	//Output:The user's card, followed by a message asking the user if the user wants to change the card, 
	//		followed optionally the user's new card, followed by the computer's card, followed by the 
	//		result of the game, followed by a message asking the user if the user wants to play again. 
	//Pre: Have the DeckOfCards class in the same folder as OneCard
	public static void play()
	{
		Scanner f=new Scanner(System.in);
		DeckOfCards d = new DeckOfCards();
		d.shuffle();
		String userCad=d.deal();
		System.out.printf("Your card: %s\n",userCad);
		System.out.print("Change card(y/n): ");
		char input=f.nextLine().charAt(0);
		if(input=='Y'||input=='y')
		{
			userCad=d.deal();
			System.out.printf("Your card: %s\n",userCad);
		}
		String computerCad=d.deal();
		System.out.printf("Dealer's card: %s\n",computerCad);
		int uservalue=firstRank(userCad);
		int computervalue=firstRank(computerCad);
		String answer=whoWin(uservalue,computervalue);
		System.out.println(answer);
	}
	//returns: The rank of the users card and the computer card as an int
	public static int firstRank(String value)
	{
		int rank=0;
		if(value.startsWith("Ace"))
			return rank=14;
		else if(value.startsWith("King"))
			return rank=13;
		else if(value.startsWith("Queen"))
			return rank=12;
		else if(value.startsWith("Jack"))
			return rank=11;
		else if(value.startsWith("Ten"))
			return rank=10;
		else if(value.startsWith("Nine"))
			return rank=9;
		else if(value.startsWith("Eight"))
			return rank=8;
		else if(value.startsWith("Seven"))
			return rank=7;
		else if(value.startsWith("Six"))
			return rank=6;
		else if(value.startsWith("Five"))
			return rank=5;
		else if(value.startsWith("Four"))
			return rank=4;
		else if(value.startsWith("Three"))
			return rank=3;
		else if(value.startsWith("Two"))
			return rank=2;
		else
			return -1;
	}
	//returns:A String of the winner of the game between user and computer
	public static String whoWin(int uservalue,int computervalue)
	{
		String winner="";
		if(computervalue>uservalue)
			winner= "You lost";
		else if(computervalue<uservalue)
			winner= "You won";
		else
			winner="tie";
		return winner;
	}

}