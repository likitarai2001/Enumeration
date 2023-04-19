public class Main {
    public static void main(String[] args) {
        Card card_ = Card.SPADE;
        System.out.println("\nThis card is of " + card_ + " and it's a " + card_.cardInfo(card_) + "\n");

        Card card_arr[] = Card.values();

        for(Card c : card_arr){
            System.out.println(c + " = " + c.cardInfo(c) + " is at index " + c.ordinal());
        }

        System.out.println("\nEnum constant of SPADE is " + Card.valueOf("SPADE"));

        System.out.println("Get enum constant for 'KING' - " + Card.getCard("KING"));
    }
}