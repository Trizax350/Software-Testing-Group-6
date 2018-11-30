package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface ManageCoursesInterface {

    void addCourse(Course course) throws AlreadyExistsException;
    void updateCourse(Course course) throws NotFoundException;
    void deleteCourse(Course course) throws NotFoundException;
    Collection<Course> getAllCourse();
    Collection<Course> getAllCourseByRecommendedSemester(int semester);
    Collection<Course> getAllCourseByCredits(int credits);
    Collection<Course> getAllCourseByUser(User user);
    Collection<Course> findCourseByName(String name);

}
