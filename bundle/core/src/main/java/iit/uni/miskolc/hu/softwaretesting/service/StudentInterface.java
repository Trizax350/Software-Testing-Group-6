package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.Request;


public interface StudentInterface extends UserInterface {

    public void addCourse(Course course);
    public void deleteCourse(Course course);
    public void sendRequest (Request request);
}
