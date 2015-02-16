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

        assertEquals("ENGL 101" + StringUtil.NEWLINE + "CZEC 200" + StringUtil.NEWLINE + "ITAL 410" + StringUtil.NEWLINE, report.text());

    }

}
