package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import pieces.Pawn;

public class PawnTest extends TestCase {

    public void testCreateDefault() {
        Pawn pawn = new Pawn();
        Assert.assertEquals(Pawn.WHITE, pawn.getColour());
        Assert.assertEquals(".", pawn.toString());
    }

    public void testCreateColouredPawn() {
        Pawn whitePawn = new Pawn(Pawn.WHITE, Pawn.WHITE_REPRESENTATION);
        Assert.assertEquals(Pawn.WHITE, whitePawn.getColour());
        Assert.assertEquals("p", whitePawn.toString());

        Pawn blackPawn = new Pawn(Pawn.BLACK, Pawn.BLACK_REPRESENTATION);
        Assert.assertEquals(Pawn.BLACK, blackPawn.getColour());
        Assert.assertEquals("P", blackPawn.toString());
    }
}