package sis.report;

import sis.studentinfo.*;

public class RosterReport {

    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_FOOTER = "FOOTER";
    public static final String ROSTER_REPORT_HEADER = "HEADER";

    private final CourseSession session;

    public RosterReport(CourseSession session) {
        this.session = session;

    }

    public String getReport() {
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);

        return buffer.toString();
    }

    private void writeBody(StringBuilder buffer) {
        for (Student student: session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }

    private StringBuilder writeFooter(StringBuilder buffer) {
        return buffer.append(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);
    }

    private StringBuilder writeHeader(StringBuilder buffer) {
        return buffer.append(ROSTER_REPORT_HEADER);
    }
}
