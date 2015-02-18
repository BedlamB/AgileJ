package pieces;

public class Piece {



    public enum Colour {BLACK, WHITE};
    public enum Type {PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING};

    public static char PAWN_REPRESENTATION = 'P';
    public static char KNIGHT_REPRESENTATION = 'N';
    public static char ROOK_REPRESENTATION = 'R';
    public static char BISHOP_REPRESENTATION = 'B';
    public static char QUEEN_REPRESENTATION = 'Q';
    public static char KING_REPRESENTATION = 'K';

    public static int blackCount;
    public static int whiteCount;

    private String colour;
    private String name;
    private String type;
    private String representation;


    private Piece(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    private Piece (Type type, Colour colour, String representation){
        this.type = type.toString();
        this.colour = colour.toString();
        this.representation = representation;
    }


    public static Piece createPiece(Piece.Type type, Piece.Colour colour) {
        return new Piece(type, colour, "P");
    }

    public boolean isWhite() {
        return colour.equals(Colour.WHITE.toString());
    }

    public boolean isBlack() {
        return colour.equals(Colour.BLACK.toString());
    }

    public String getType() {
        return type.toString();
    }

    public String getRepresentation() {
        return representation;
    }

    @Override public String toString() {
        return name;
    }
}
