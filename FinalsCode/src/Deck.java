import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	private String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public String otherName(int value) {
		switch (value) {
							case 2 : return "two";
							case 3 : return "three";		
							case 4 : return "four";	
							case 5 : return "five";
							case 6 : return "six";
							case 7 : return "seven";
							case 8 : return "eight";
							case 9 : return "nine";
							case 10 : return "ten";
							case 11 : return "jack";
							case 12 : return "queen";
							case 13 : return "king";
							case 14 : return "ace";
	}
		return null;
		}
	public Deck() {
		for(int i = 0; i < suit.length; i++) {
			for(int k = 2; k < 15; k++) {
				String Temporary = otherName(k) +" of "+ suit[i];
				cards.add(new Card(Temporary, k));
				}
			}
		}
	 public void shuffle () {
		 	Collections.shuffle(cards);
	 }
	 	public List <Card> getcards () {
	 		return cards;
	 		
	 	}
	 	public void setcards (List<Card>cards) {
	 		this.cards =cards;
	 	}
	 	public Card draw () {
	 		return cards.remove(0);
	 		
	 	}
	}