package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface ManageCoursesInterface {

    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Course course);
    Collection<Course> getAllCourse();
    Collection<Course> getAllCourseByRecommendedSemester(int semester);
    Collection<Course> getAllCourseByCredits(int credits);
    Collection<Course> getAllCourseByUser(String user);

}