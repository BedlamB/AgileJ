package tests;

import chess.ChessBoard;
import junit.framework.Assert;
import junit.framework.TestCase;

import static chess.ChessBoard.LINE_END;

public class ChessBoardTest extends TestCase {

    public void testBoardCreate(){
        ChessBoard board = new ChessBoard();
        assertNotNull(board);
        Assert.assertEquals(16, board.pieceCount());
        String blankRank = "........" + LINE_END;

        Assert.assertEquals(blankRank +
                            "pppppppp" + LINE_END +
                            blankRank +
                            blankRank +
                            blankRank +
                            blankRank +
                            "PPPPPPPP" + LINE_END +
                            blankRank, board.toString());

        System.out.println(board.toString());
    }
}