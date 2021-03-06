package sis.studentinfo;

import junit.framework.*;

public class StudentTest extends TestCase {

    private static final double GRADE_TOLERANCE = 5 / 100;

    public void testCreate() {
      final String firstStudentName = "Jane Doe";
      Student firstStudent = new Student(firstStudentName);
      assertEquals(firstStudentName, firstStudent.getName());

      final String secondStudentName = "Joe Blow";
      Student secondStudent = new Student(secondStudentName);
      assertEquals(secondStudentName, secondStudent.getName());
   }

    public void testStudentStatus(){
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testInState(){
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        student.setState("MD");
        assertFalse(student.isInState());
    }


    public void testCalculateRegularGPA() {
        Student student = new Student("a");
        assertGPA(student, 0.0);
        student.addGrade(Student.Grade.A);
        assertGPA(student, 4.0);
        student.addGrade(Student.Grade.B);
        assertGPA(student, 3.5);
        student.addGrade(Student.Grade.C);
        assertGPA(student, 3.0);
        student.addGrade(Student.Grade.D);
        assertGPA(student, 2.5);
        student.addGrade(Student.Grade.F);
        assertGPA(student, 2.0);

    }

    public void testCalculateHonorsStudent() {
        assertGPA(createHonorsStudent(), 0.0);
        assertGPA(createHonorsStudent(Student.Grade.A), 5.0);
        assertGPA(createHonorsStudent(Student.Grade.B), 4.0);
        assertGPA(createHonorsStudent(Student.Grade.C), 3.0);
        assertGPA(createHonorsStudent(Student.Grade.D), 2.0);
        assertGPA(createHonorsStudent(Student.Grade.F), 0.0);
    }

    private Student createHonorsStudent(Student.Grade grade) {
        Student student = createHonorsStudent();
        student.addGrade(grade);
        return student;
    }

    private Student createHonorsStudent() {
        Student student = new Student("a");
        student.setGradingStrategy(new HonorsGradingStrategy());
        return student;
    }

    private void assertGPA(Student student, double expectedGPA) {
        assertEquals(expectedGPA, student.getGPA(), GRADE_TOLERANCE);
    }

}