package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CourseTestMethods {
    private Course course;
    private String name = "Course 1";
    private int credits = 5;
    private int recSem = 2;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void createCourse() throws InvalidCreditsValueException, InvalidCourseNameException, InvalidRecommendedSemesterException {
        course = new Course(this.name, this.credits, this.recSem);
    }

    @Test
    public void testGetName(){
        assertEquals(this.name, this.course.getName());
    }

    @Test
    public void testSetName() throws InvalidCourseNameException {
        String name = "Course 7";
        this.course.setName(name);
        assertEquals(name, this.course.getName());
    }

    @Test
    public void testGetCredits(){
        assertEquals(this.credits, this.course.getCredits());
    }

    @Test
    public void testSetCredits() throws InvalidCreditsValueException {
        int credits = 3;
        this.course.setCredits(credits);
        assertEquals(credits, this.course.getCredits());
    }

    @Test
    public void testGetRecSem(){
        assertEquals(this.recSem, this.course.getRecSem());
    }

    @Test
    public void testSetRecSem() throws InvalidRecommendedSemesterException {
        int recSem = 4;
        this.course.setRecSem(recSem);
        assertEquals(recSem, this.course.getRecSem());
    }
}
