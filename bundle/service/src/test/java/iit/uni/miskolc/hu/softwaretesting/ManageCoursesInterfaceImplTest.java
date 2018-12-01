package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.service.ManageCoursesInterfaceImpl;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ManageCoursesInterfaceImplTest {

    //@Mock
    private CourseDAO courseDAOMock;

    //@InjectMocks
    private ManageCoursesInterfaceImpl courseManager;

    public ManageCoursesInterfaceImplTest() {
        super();
    }

    @Before
    public void start() throws Exception {
        //MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCourse(){

    }

    @Test
    public void testUpdateCourse(){

    }

    @Test
    public void testDeleteCourse(){

    }

    @Test
    public void testGetAllCourse(){

    }

    @Test
    public void testGetAllCourseByRecommendedSemester(){

    }

    @Test
    public void testGetAllCourseByCredits() {

    }

    @Test
    public void testGetAllCourseByUser() {

    }

    @Test
    public void testFindCourseByName() {

    }
}
