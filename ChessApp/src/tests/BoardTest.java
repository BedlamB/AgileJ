package tests;

import chess.Board;
import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Piece;
import util.StringUtil;

public class BoardTest extends TestCase {

    public void testBoardCreate() {
        Board board = new Board();
        board.initialize();
        assertNotNull(board);
        String blankRank =  StringUtil.appendNewLine("........");

        System.out.println(board.toString());
        Assert.assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
                            StringUtil.appendNewLine("PPPPPPPP") +
                            blankRank +
                            blankRank +
                            blankRank +
                            blankRank +
                            StringUtil.appendNewLine("PPPPPPPP") +
                            StringUtil.appendNewLine("RNBQKBNR")
                            , board.toString());
        assertEquals(16, Piece.whiteCount);
        assertEquals(16, Piece.blackCount);

    }

}