package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.*;

public class RosterReportTest extends TestCase {

    public void testRosterReport() {
        DateUtil dateUtil = new DateUtil();
        CourseSession session = new CourseSession("ENGL", "101", dateUtil.createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReport(session).getReport();

        assertEquals(
                RosterReport.ROSTER_REPORT_HEADER +
                        "A" + RosterReport.NEWLINE +
                        "B" + RosterReport.NEWLINE +
                        RosterReport.ROSTER_REPORT_FOOTER + "2" +
                        RosterReport.NEWLINE, rosterReport);
    }
}
