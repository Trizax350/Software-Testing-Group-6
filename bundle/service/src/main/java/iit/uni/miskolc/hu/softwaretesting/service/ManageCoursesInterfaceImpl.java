package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public class ManageCoursesInterfaceImpl implements ManageCoursesInterface {

    private CourseDAO courseDAO;

    public ManageCoursesInterfaceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public void addCourse(Course course) {
        courseDAO.createCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseDAO.modifyCourse(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseDAO.removeCourse(course);
    }

    @Override
    public Collection<Course> getAllCourse() {
        return courseDAO.searchAllCourse();
    }

    @Override
    public Collection<Course> getAllCourseByRecommendedSemester(int semester) {
        return courseDAO.searchAllCourseByRecommendedSemester(semester);
    }

    @Override
    public Collection<Course> getAllCourseByCredits(int credits) {
        return courseDAO.searchAllCourseByCredits(credits);
    }

    @Override
    public Collection<Course> getAllCourseByUser(User user) {
        return courseDAO.searchAllCourseByUser(user);
    }

    @Override
    public Collection<Course> findCourseByName(String name) {
        return courseDAO.searchCourseByName(name);
    }

}
