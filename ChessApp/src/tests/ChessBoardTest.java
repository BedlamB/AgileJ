package tests;

import chess.ChessBoard;
import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Pawn;

public class ChessBoardTest extends TestCase {

    public void testBoardCreate(){
        ChessBoard board = new ChessBoard();
        Assert.assertEquals(0, board.getSize());
        testAddPawn();
    }

    public void testAddPawn() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn();
        board.add(pawn);

        Assert.assertEquals(1, board.getSize());
        Assert.assertEquals(pawn, board.getPawn(0));

        Pawn pawn2 = new Pawn();
        board.add(pawn2);

        Assert.assertEquals(2, board.getSize());
        Assert.assertEquals(pawn2, board.getPawn(1));
    }
}
