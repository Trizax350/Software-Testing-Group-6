package iit.uni.miskolc.hu.softwaretesting.model;

import iit.uni.miskolc.hu.softwaretesting.exceptions.*;

import java.util.ArrayList;
import java.util.Collection;

public class Student extends User {


    //students can be active or passive
    public enum Status {
        ACTIVE, PASSIVE
    }

    private Status status;
    private ArrayList<Course> courses;

    public Student(int id, String name, String email, String username, String password, Status status, ArrayList<Course> courses) throws EmptyFieldException, InvalidIDValueException, InvalidPasswordException, InvalidEmailException {
        super(id, name, email, username, password);
        this.status = status;
        this.courses = courses;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

}
