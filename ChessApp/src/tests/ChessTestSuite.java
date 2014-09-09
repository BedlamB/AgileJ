package tests;

import junit.framework.TestSuite;

public class ChessTestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(ChessBoardTest.class);
        return suite;
    }


}
