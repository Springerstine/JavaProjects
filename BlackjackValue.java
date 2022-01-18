/**
 @author:	 Zachary Springer
 @date:		 06/07/2019
 desc:		 This program evaluates a card and a hand and returns the blackjack value
*/
import java.util.Arrays;
public class BlackjackValue {
	public static void main(String[] args) {
		
		String[] hand1 = {"AS","AH"};
		String[] hand2 = {"AS","AH","AC","AD"};
		String[] hand3 = {"QS","QH"};
		String[] hand4 = {"4S","6C", "KC", "KS"};
		String[] hand5 = {"AS","AH","AC","AD","KS"};
		String[] hand6 = {"KS","KC", "AH", "10C"};
		
		
		System.out.println(getBlackjackValue("AS"));
		System.out.println(getBlackjackValue("AC"));
		System.out.println(getBlackjackValue("7S"));
		System.out.println(getBlackjackValue("6C"));
		System.out.println(getBlackjackValue("10C"));
		
		System.out.println("");
		
		System.out.println(blackjackHandValue(hand1));
		System.out.println(blackjackHandValue(hand2));
		System.out.println(blackjackHandValue(hand3));
		System.out.println(blackjackHandValue(hand4));
		System.out.println(blackjackHandValue(hand5));
		System.out.println(blackjackHandValue(hand6));
		
	}
	
	public static int getBlackjackValue(String card) {
		String cardV = card;
		String rank = Character.toString(cardV.charAt(0));
		int valueOfCard = 0;
		
			switch(rank){
				case "A": 
					valueOfCard += 11;
					break;
				case "2": 
					valueOfCard += 2;
					break;
				case "3": 
					valueOfCard += 3;
					break;
				case "4": 
					valueOfCard += 4;
					break;
				case "5": 
					valueOfCard += 5;
					break;
				case "6": 
					valueOfCard += 6;
					break;
				case "7": 
					valueOfCard += 7;
					break;
				case "8": 
					valueOfCard += 8;
					break;
				case "9": 
					valueOfCard += 9;
					break;
				case "1":
				case "J":
				case "Q":
				case "K":
					valueOfCard += 10;
					break;
			}
		return valueOfCard;
	}
			
			
		
		public static int blackjackHandValue(String[] hand) {
			int valueOfHand = 0;
			int len = hand.length;

			for (int i = 0; i < len; i++) {
				String rank = Character.toString(hand[i].charAt(0));
				int aceCounter = 0;
				
				if (aceCounter < 1) {
					if (rank == "A"){
						aceCounter += 1;
					}
					valueOfHand += getBlackjackValue(hand[i]);
				}
				switch(rank){
					case "A": 
						valueOfHand += 1;
						break;
					case "2": 
						valueOfHand += 2;
						break;
					case "3": 
						valueOfHand += 3;
						break;
					case "4": 
						valueOfHand += 4;
						break;
					case "5": 
						valueOfHand += 5;
						break;
					case "6": 
						valueOfHand += 6;
						break;
					case "7": 
						valueOfHand += 7;
						break;
					case "8": 
						valueOfHand += 8;
						break;
					case "9": 
						valueOfHand += 9;
						break;
					case "1":
					case "J":
					case "Q":
					case "K":
						valueOfHand += 10;
						break;
				}
			}
			return valueOfHand;
		}
}	