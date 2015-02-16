package tests;

import junit.framework.TestSuite;

public class ChessTestSuite {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PieceTest.class);
        suite.addTestSuite(BoardTest.class);
        return suite;
    }
}