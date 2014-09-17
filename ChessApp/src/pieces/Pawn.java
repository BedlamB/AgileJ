package pieces;

public class Pawn {

    public static final String BLACK = "black";
    public static final String WHITE = "white";
    public static final String WHITE_REPRESENTATION = "p";
    public static final String BLACK_REPRESENTATION = "P";

    private String colour;
    private String representation;

    public Pawn() {
        this.colour = WHITE;
        this.representation = ".";
    }

    public Pawn(String colour, String representation) {
        this.colour = colour;
        this.representation = representation;
    }

    public String getColour() {
        return colour;
    }

    @Override public String toString() {
        return representation;
    }
}
