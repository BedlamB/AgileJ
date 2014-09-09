package pieces;

public class Pawn {

    public static final String BLACK = "black";
    public static final String WHITE = "white";

    private String colour;

    public Pawn(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public Pawn() {
        this.colour = WHITE;
    }
}
