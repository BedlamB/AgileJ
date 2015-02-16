package sis.report;

import java.util.Date;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.util.StringUtil;

public class CourseReportTest extends TestCase {

    public void testReport() {
        final Date date = new Date();
        CourseReport report = new CourseReport();
        report.add(CourseSession.create("ENGL", "101", date));
        report.add(CourseSession.create("CZEC", "200", date));
        report.add(CourseSession.create("ITAL", "410", date));

        assertEquals("CZEC 200" + StringUtil.NEWLINE + "ENGL 101" + StringUtil.NEWLINE + "ITAL 410" + StringUtil.NEWLINE, report.text());

    }

    public void testComparableSession() {
        final Date date = new Date();
        CourseSession sessionA = CourseSession.create("CMSC", "101", date);
        CourseSession sessionB = CourseSession.create("ENGL", "101", date);

        assertTrue(sessionA.compareTo(sessionB) < 0 );
        assertTrue(sessionB.compareTo(sessionA) > 0 );

        CourseSession sessionC = CourseSession.create("CMSC", "101", date);
        assertEquals(0, sessionA.compareTo(sessionC));
    }


}
