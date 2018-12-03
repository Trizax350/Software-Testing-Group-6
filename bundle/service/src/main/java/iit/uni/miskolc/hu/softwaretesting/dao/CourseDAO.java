package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface CourseDAO {

    void createCourse(Course course) throws AlreadyExistsException;
    void modifyCourse(Course course) throws NotFoundException;
    void removeCourse(Course course) throws NotFoundException;
    Collection<Course> searchAllCourse();
    Collection<Course> searchAllCourseByRecommendedSemester(int semester);
    Collection<Course> searchAllCourseByCredits(int credits);
    Collection<Course> searchAllCourseByUser(User user);
    Collection<Course> searchCourseByName(String name);

}
