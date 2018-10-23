package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.Request;


public interface StudentInterface extends UserInterface {

    void addCourse(Course course);
    void deleteCourse(Course course);
    void sendRequest (Request request);
}
