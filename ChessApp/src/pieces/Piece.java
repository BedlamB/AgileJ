package pieces;

public class Piece {



    public enum Colour {BLACK, WHITE, BLANK};
    public enum Type {PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING, NO_PIECE};

    public static final char PAWN_REPRESENTATION = 'p';
    public static final char KNIGHT_REPRESENTATION = 'n';
    public static final char ROOK_REPRESENTATION = 'r';
    public static final char BISHOP_REPRESENTATION = 'b';
    public static final char QUEEN_REPRESENTATION = 'q';
    public static final char KING_REPRESENTATION = 'k';

    public static final Piece noPiece = new Piece(Type.NO_PIECE, Colour.WHITE);

    public static int blackCount;
    public static int whiteCount;

    private Colour colour;
    private Type type;

    private Piece (Type type, Colour colour){
        this.type = type;
        this.colour = colour;
    }

    public static Piece createWhitePawn() {
        return create(Type.PAWN, Colour.WHITE);
    }


    public static Piece createBlackPawn() {
        return create(Type.PAWN, Colour.BLACK);
    }


    public static Piece createWhiteRook() {
        return create(Type.ROOK, Colour.WHITE);
    }


    public static Piece createBlackRook() {
        return create(Type.ROOK, Colour.BLACK);
    }


    public static Piece createWhiteKnight() {
        return create(Type.KNIGHT, Colour.WHITE);
    }


    public static Piece createBlackKnight() {
        return create(Type.KNIGHT, Colour.BLACK);
    }


    public static Piece createWhiteBishop() {
        return create(Type.BISHOP, Colour.WHITE);
    }


    public static Piece createBlackBishop() {
        return create(Type.BISHOP, Colour.BLACK);
    }


    public static Piece createWhiteQueen() {
        return create(Type.QUEEN, Colour.WHITE);
    }


    public static Piece createBlackQueen() {
        return create(Type.QUEEN, Colour.BLACK);
    }


    public static Piece createWhiteKing() {
        return create(Type.KING, Colour.WHITE);
    }


    public static Piece createBlackKing() {
        return create(Type.KING, Colour.BLACK);
    }

    public static Piece create(Type type, Colour colour) {
        if (colour.equals(Colour.WHITE))
            whiteCount++;
        else
            blackCount++;
        return new Piece(type, colour);
    }

    public boolean isWhite() {
        return colour.equals(Colour.WHITE);
    }

    public boolean isBlack() {
        return colour.equals(Colour.BLACK);
    }

    public Type getType() {
        return type;
    }

    public char getRepresentation() {
        char representation = '.';
        if (type.equals(Type.PAWN)) representation = PAWN_REPRESENTATION;
        else if (type.equals(Type.ROOK)) representation = ROOK_REPRESENTATION;
        else if (type.equals(Type.KNIGHT)) representation = KNIGHT_REPRESENTATION;
        else if (type.equals(Type.BISHOP)) representation = BISHOP_REPRESENTATION;
        else if (type.equals(Type.QUEEN)) representation = QUEEN_REPRESENTATION;
        else if (type.equals(Type.KING)) representation = KING_REPRESENTATION;
        if (colour.equals(Colour.BLACK)) representation = Character.toUpperCase(representation);

        return representation;
    }

    public static void resetCounts() {
        whiteCount = 0;
        blackCount = 0;
    }

    @Override public String toString() {
        return type.toString() + colour.toString();
    }
}
