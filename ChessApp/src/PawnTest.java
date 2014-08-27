import junit.framework.TestCase;

public class PawnTest extends TestCase {

    public void testCreate(){
        final String pawnColour = "white";
        Pawn  pawn = new Pawn(pawnColour);
        assertEquals(pawnColour, pawn.getColour());

        final String pawnColour2 = "black";
        Pawn  pawn2 = new Pawn(pawnColour2);
        assertEquals(pawnColour2, pawn2.getColour());
    }

}