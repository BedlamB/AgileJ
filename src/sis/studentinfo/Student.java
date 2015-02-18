package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

public class Student {

    enum Grade {A, B, C, D, F};

    public static final String IN_STATE = "CO";
    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

    private String name;
    private String state = "";
    private int credits;
    private GradingStrategy gradingStrategy = new RegularGradingStrategy();
    private List<Grade> grades = new ArrayList<Grade>();

    public Student(String name) {
        this.name = name;
        credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isInState() {
        return state.equals(Student.IN_STATE);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double getGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Grade grade : grades) {
            total += gradingStrategy.getGradePointsFor(grade);
        }
        return total / grades.size();
    }
}