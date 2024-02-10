package lessons.lesson_18_poker.entity;

public class Card {

    private String value;

    private String suit;

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
