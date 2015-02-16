package pieces;

public class Piece {

    public static final String BLACK = "black";
    public static final String WHITE = "white";
    public static int blackCount;
    public static int whiteCount;

    private String colour;
    private String name;


    private Piece(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public static Piece createPiece(String colour, String name) {
        return new Piece(colour, name);
    }

    public boolean isWhite() {
        return colour == Piece.WHITE;
    }

    public boolean isBlack() {
        return colour == Piece.BLACK;
    }

    @Override public String toString() {
        return name;
    }
}
