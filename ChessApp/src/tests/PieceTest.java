package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Piece;

public class PieceTest extends TestCase {


    public void testCreatePiece() {
        Piece whitePiece = Piece.createPiece(Piece.Type.PAWN, Piece.Colour.WHITE);
        Piece blackPiece = Piece.createPiece(Piece.Type.PAWN, Piece.Colour.BLACK);
        assertEquals(true, whitePiece.isWhite());
        assertEquals(true, blackPiece.isBlack());
        assertEquals(false, blackPiece.isWhite());
    }

    public void testCreate() {
        verifyCreation(Piece.createPiece(Piece.Type.PAWN, Piece.Colour.WHITE), Piece.createPiece(Piece.Type.PAWN, Piece.Colour.BLACK), Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);
//        verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(), Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);
//        verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(), Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);
//        verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(), Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);
//        verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(), Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);
//        verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(), Piece.Type.KING, Piece.KING_REPRESENTATION);
    }

    private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type, char representation) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());
        assertEquals(representation, whitePiece.getRepresentation());

        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
        assertEquals(Character.toUpperCase(representation), blackPiece.getRepresentation());
    }

}
