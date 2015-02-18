package sis.studentinfo;

public class EliteGradingStrategy implements GradingStrategy {

    @Override
    public int getGradePointsFor(Student.Grade grade) {
        return 4;
    }
}
