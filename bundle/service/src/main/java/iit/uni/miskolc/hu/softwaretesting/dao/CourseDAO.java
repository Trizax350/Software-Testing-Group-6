package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface CourseDAO {

    void createCourse(Course course);
    void modifyCourse(Course course);
    void removeCourse(Course course);
    Collection<Course> searchAllCourse();
    Collection<Course> searchAllCourseByRecommendedSemester(int semester);
    Collection<Course> searchAllCourseByCredits(int credits);
    Collection<Course> searchAllCourseByUser(User user);
    Collection<Course> searchCourseByName(String name);

}
