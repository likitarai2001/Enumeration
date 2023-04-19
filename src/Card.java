import java.util.HashMap;
import java.util.Map;

public enum Card {
    SPADE("KING"),
    HEART("QUEEN"),
    DIAMOND,
    CLUB("JOKER");

    private String card_face;
    private static final Map<String, String> lookup = new HashMap<String, String>();

    static {
        for(Card c : Card.values()){
            lookup.put(c.card_face, c.name());
        }
    }

    Card() {
        this.card_face = "JACK";
    }

    Card(String card_face){
        this.card_face = card_face;
        System.out.println("Constructor called - " + this.name());
    }

    public String cardInfo(Card c){
        return c.card_face;
    }

    public static String getCard(String str){
        return lookup.getOrDefault(str, "NOT EXISTS");
    }
}
