package iit.uni.miskolc.hu.softwaretesting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import iit.uni.miskolc.hu.softwaretesting.model.Course;

import java.util.List;

public class CourseDAOImplTest {
    private CourseDAOImpl courseDAO;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void start() throws Exception{
        courseDAO = new CourseDAOImpl();
    }

    @Test
    public void testCreateCoruse(){
        Course course1 = new Course("Operációs rendszerek", 5, 2);
        courseDAO.createCourse(course1);

        Course course2 = new Course("Számítógép hálózatok", 5, 3);
        courseDAO.createCourse(course2);

        Course course3 = new Course("Windows rendszergazda", 5, 5);
        courseDAO.createCourse(course3);
    }

    @Test
    public void testModifyCourse(){
        Course course = new Course("Szoftvertesztelés", 2, 5);
        courseDAO.createCourse(course);

        Course modifiedcourse = new Course("Szoftvertesztelés", 4, 5);
        courseDAO.modifyCourse(modifiedcourse);
    }

    @Test
    public void testRemoveCourse(){
        Course course = new Course("Analízis II.", 5, 2);
        courseDAO.createCourse(course);
        courseDAO.removeCourse(course);
    }
}
