package peronal.project.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {

	private String name;
	private Integer value;
	private Integer value1;

	public Card(String name, Integer value) {
		this.name = name;
		this.value = value;
	}

	public List<Card> getCards(Integer numerOfCards) {
		List<Card> cardList = new ArrayList<Card>();
		Card aceOfHearts = new Card("aceOfHearts", 1, 11);
		cardList.add(aceOfHearts);
		Card twoOfHearts = new Card("twoOfHearts", 2);
		cardList.add(twoOfHearts);
		Card threeOfHearts = new Card("threeOfHearts", 3);
		cardList.add(threeOfHearts);
		Card fourOfHearts = new Card("fourOfHearts", 4);
		cardList.add(fourOfHearts);
		Card fiveOfHearts = new Card("fiveOfHearts", 5);
		cardList.add(fiveOfHearts);
		Card sixOfHearts = new Card("sixOfHearts", 6);
		cardList.add(sixOfHearts);
		Card sevenOfHearts = new Card("sevenOfHearts", 7);
		cardList.add(sevenOfHearts);
		Card eightOfHearts = new Card("eightOfHearts", 8);
		cardList.add(eightOfHearts);
		Card nineOfHearts = new Card("nineOfHearts", 9);
		cardList.add(nineOfHearts);
		Card tenOfHearts = new Card("tenOfHearts", 10);
		cardList.add(tenOfHearts);
		Card jackOfHearts = new Card("jackOfHearts", 10);
		cardList.add(jackOfHearts);
		Card queenOfHearts = new Card("queenOfHearts", 10);
		cardList.add(queenOfHearts);
		Card kingOfHearts = new Card("kingOfHearts", 10);
		cardList.add(kingOfHearts);

		Card aceOfDiamonds = new Card("aceOfDiamonds", 1, 11);
		cardList.add(aceOfDiamonds);
		Card twoOfDiamonds = new Card("twoOfDiamonds", 2);
		cardList.add(twoOfDiamonds);
		Card threeOfDiamonds = new Card("threeOfDiamonds", 3);
		cardList.add(threeOfDiamonds);
		Card fourOfDiamonds = new Card("fourOfDiamonds", 4);
		cardList.add(fourOfDiamonds);
		Card fiveOfDiamonds = new Card("fiveOfDiamonds", 5);
		cardList.add(fiveOfDiamonds);
		Card sixOfDiamonds = new Card("sixOfDiamonds", 6);
		cardList.add(sixOfDiamonds);
		Card sevenOfDiamondts = new Card("sevenOfDiamonds", 7);
		cardList.add(sevenOfDiamondts);
		Card eightOfDiamonds = new Card("eightOfDiamonds", 8);
		cardList.add(eightOfDiamonds);
		Card nineOfDiamonds = new Card("nineOfDiamonds", 9);
		cardList.add(nineOfDiamonds);
		Card tenOfDiamonds = new Card("tenOfDiamonds", 10);
		cardList.add(tenOfDiamonds);
		Card jackOfDiamonds = new Card("jackOfDiamonds", 10);
		cardList.add(jackOfDiamonds);
		Card queenOfDiamonds = new Card("queenOfDiamonds", 10);
		cardList.add(queenOfDiamonds);
		Card kingOfDiamonds = new Card("kingOfDiamonds", 10);
		cardList.add(kingOfDiamonds);

		Card aceOfSpades = new Card("aceOfSpades", 1, 11);
		cardList.add(aceOfSpades);
		Card twoOfSpades = new Card("twoOfSpades", 2);
		cardList.add(twoOfSpades);
		Card threeOfSpades = new Card("threeOfSpades", 3);
		cardList.add(threeOfSpades);
		Card fourOfSpades = new Card("fourOfSpades", 4);
		cardList.add(fourOfSpades);
		Card fiveOfSpades = new Card("fiveOfSpades", 5);
		cardList.add(fiveOfSpades);
		Card sixOfSpades = new Card("sixOfSpades", 6);
		cardList.add(sixOfSpades);
		Card sevenOfSpades = new Card("sevenOfSpades", 7);
		cardList.add(sevenOfSpades);
		Card eightOfSpades = new Card("eightOfSpades", 8);
		cardList.add(eightOfSpades);
		Card nineOfSpades = new Card("nineOfSpades", 9);
		cardList.add(nineOfSpades);
		Card tenOfSpades = new Card("tenOfSpades", 10);
		cardList.add(tenOfSpades);
		Card jackOfSpades = new Card("jackOfSpades", 10);
		cardList.add(jackOfSpades);
		Card queenOfSpades = new Card("queenOfSpades", 10);
		cardList.add(queenOfSpades);
		Card kingOfSpades = new Card("kingOfSpades", 10);
		cardList.add(kingOfSpades);

		Card aceOfClubs = new Card("aceOfClubs", 1, 11);
		cardList.add(aceOfClubs);
		Card twoOfClubs = new Card("twoOfClubs", 2);
		cardList.add(twoOfClubs);
		Card threeOfClubs = new Card("threeOfClubs", 3);
		cardList.add(threeOfClubs);
		Card fourOfClubs = new Card("fourOfClubs", 4);
		cardList.add(fourOfClubs);
		Card fiveOfClubs = new Card("fiveOfClubs", 5);
		cardList.add(fiveOfClubs);
		Card sixOfClubs = new Card("sixOfClubs", 6);
		cardList.add(sixOfClubs);
		Card sevenOfClubs = new Card("sevenOfClubs", 7);
		cardList.add(sevenOfClubs);
		Card eightOfClubs = new Card("eightOfClubs", 8);
		cardList.add(eightOfClubs);
		Card nineOfClubs = new Card("nineOfClubs", 9);
		cardList.add(nineOfClubs);
		Card tenOfClubs = new Card("tenOfClubs", 10);
		cardList.add(tenOfClubs);
		Card jackOfClubs = new Card("jackOfClubs", 10);
		cardList.add(jackOfClubs);
		Card queenOfClubs = new Card("queenOfClubs", 10);
		cardList.add(queenOfClubs);
		Card kingOfClubs = new Card("kingOfClubs", 10);
		cardList.add(kingOfClubs);

		if (numerOfCards == 48) {
			cardList.remove(tenOfHearts);
			cardList.remove(tenOfDiamonds);
			cardList.remove(tenOfSpades);
			cardList.remove(tenOfClubs);
		}

		return cardList;

	}

}
