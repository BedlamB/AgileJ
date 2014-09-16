package sis.report;

import junit.framework.TestSuite;

public class AllTests {
        public static TestSuite suite() {
            TestSuite suite = new TestSuite();
            suite.addTestSuite(RosterReportTest.class);
            return suite;
        }
}
