package tests;

import chess.ChessBoard;
import junit.framework.Assert;
import junit.framework.TestCase;
import util.StringUtil;

public class ChessBoardTest extends TestCase {

    public void testBoardCreate(){
        ChessBoard board = new ChessBoard();
        assertNotNull(board);
        Assert.assertEquals(16, board.pieceCount());
        String blankRank =  StringUtil.appendNewLine("........");

        System.out.println(board.toString());
        Assert.assertEquals(blankRank +
                            StringUtil.appendNewLine("pppppppp") +
                            blankRank +
                            blankRank +
                            blankRank +
                            blankRank +
                            StringUtil.appendNewLine("PPPPPPPP") +
                            blankRank, board.toString());
    }

    public void testStringUtils(){
        String line = "aa" + System.getProperty("line.separator");
        assertEquals(line, StringUtil.appendNewLine("aa"));
    }
}