package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidCourseNameException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidCreditsValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidRecommendedSemesterException;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import org.junit.Test;

public class CourseContructorTest {

    private Course course;

    /**
     * This test runs the constructor with the correct values
     */
    @Test
    public void testConsructorWithCorrectValues() throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        course = new Course("Name", 5, 1);
    }

    /**
     * This test runs the constructor with less credit than proper
     */
    @Test(expected = InvalidCreditsValueException.class)
    public void testConstructorWithTooLessCredits() throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        course = new Course("Name", 0, 1);
    }

    /**
     * This test runs the constructor with more credit than proper
     */
    @Test(expected = InvalidCreditsValueException.class)
    public void testConstructorWithTooMuchCredits() throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        course = new Course("Name", 1000, 1);
    }

    /**
     * This test runs the constructor with invalid recommended semester value
     */
    @Test(expected = InvalidRecommendedSemesterException.class)
    public void testConstructorWithIncorrectSemester() throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        course = new Course("Name", 5, 0);
    }

    /**
     * This test ruins the constructor with empty name param
     */
    @Test(expected = InvalidCourseNameException.class)
    public void testConstructorWithEmptyName() throws InvalidCreditsValueException, InvalidRecommendedSemesterException, InvalidCourseNameException {
        course = new Course("", 5, 1);
    }

}
