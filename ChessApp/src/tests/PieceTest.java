package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Piece;

public class PieceTest extends TestCase {


    public void testCreatePiece() {
        Piece whitePiece = Piece.createPiece(Piece.WHITE, "P");
        Piece blackPiece = Piece.createPiece(Piece.BLACK, "K");
        assertEquals(true, whitePiece.isWhite());
        assertEquals(true, blackPiece.isBlack());
        assertEquals(false, blackPiece.isWhite());
    }

}