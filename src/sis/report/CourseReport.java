package sis.report;

import java.util.ArrayList;

import sis.studentinfo.CourseSession;
import sis.util.StringUtil;

public class CourseReport {
    private ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        StringBuilder builder = new StringBuilder();
        for (CourseSession session: sessions)
            builder.append(session.getDepartment() + " " +
            session.getNumber() + StringUtil.NEWLINE);
        return builder.toString();
    }
}
