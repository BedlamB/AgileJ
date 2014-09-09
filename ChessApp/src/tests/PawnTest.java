package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Pawn;

public class PawnTest extends TestCase {

    public void testCreatePawns(){
        Pawn pawn = new Pawn(Pawn.WHITE);
        Assert.assertEquals(Pawn.WHITE, pawn.getColour());

        Pawn pawn2 = new Pawn(Pawn.BLACK);
        Assert.assertEquals(Pawn.BLACK, pawn2.getColour());

        Pawn pawn3 = new Pawn();
        Assert.assertEquals(Pawn.WHITE, pawn3.getColour());
    }
}
