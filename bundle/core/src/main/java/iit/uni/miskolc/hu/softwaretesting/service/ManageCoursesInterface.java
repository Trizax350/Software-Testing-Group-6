package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface ManageCoursesInterface {

    public Collection<Course> getAllCourses();

    void addCourse(Course course);
    void deleteCourse(Course course);


}
