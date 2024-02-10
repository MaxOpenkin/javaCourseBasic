package lessons.lesson_18_poker.entity;

public class CardDeck {

    private Card[] deck = new Card[52];

    private Card[] deckShuffle = new Card[52];

    public Card[] getDeck() {
        return deck;
    }

    public Card[] getDeckShuffle() {
        return deckShuffle;
    }
}
