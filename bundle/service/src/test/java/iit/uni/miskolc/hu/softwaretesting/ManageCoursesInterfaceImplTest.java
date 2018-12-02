package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.service.ManageCoursesInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class ManageCoursesInterfaceImplTest {

    @Mock
    private CourseDAO courseDAOMock;

    @InjectMocks
    private ManageCoursesInterfaceImpl courseManager;

    public ManageCoursesInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCourse() throws Exception {
        Course course = new Course("Java programozás", 5, 4);
        courseManager.addCourse(course);
    }

    @Test
    public void testUpdateCourse() throws Exception {
        Course course = new Course("Java programozás", 5, 4);
        Course course2 = new Course("Java programozás", 5, 2);
        
        courseManager.addCourse(course);
        courseManager.updateCourse(course2);
    }

    @Test
    public void testDeleteCourse() throws Exception{
        Course course = new Course("Java programozás", 5, 4);
        
        courseManager.addCourse(course);
        courseManager.deleteCourse(course);
    }

    @Test
    public void testGetAllCourse() throws Exception {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Programozás alapjai", 5, 1));

        doReturn(courses).when(courseDAOMock).searchAllCourse();
        assertEquals(courses, courseManager.getAllCourse());
    }

    @Test
    public void testGetAllCourseByRecommendedSemester() throws Exception {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Programozás alapjai", 5, 1));

        doReturn(courses).when(courseDAOMock).searchAllCourseByRecommendedSemester(1);
        assertEquals(courses, courseManager.getAllCourseByRecommendedSemester(1));
    }

    @Test
    public void testGetAllCourseByCredits() throws Exception {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Programozás alapjai", 5, 1));

        doReturn(courses).when(courseDAOMock).searchAllCourseByCredits(5);
        assertEquals(courses, courseManager.getAllCourseByCredits(5));
    }

    @Test
    public void testGetAllCourseByUser() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Programozás alapjai", 5, 1));

        doReturn(courses).when(courseDAOMock).searchAllCourseByUser("user1");
        assertEquals(courses, courseManager.getAllCourseByUser("user1"));

    }

    @Test
    public void testFindCourseByName() throws Exception{
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Programozás alapjai", 5, 1));

        doReturn(courses).when(courseDAOMock).searchCourseByName("Programozás alapjai");
        assertEquals(courses, courseManager.findCourseByName("Programozás alapjai"));
    }
}
