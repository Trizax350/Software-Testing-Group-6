package iit.uni.miskolc.hu.softwaretesting;

import com.sun.xml.internal.bind.v2.TODO;
import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import iit.uni.miskolc.hu.softwaretesting.model.Course;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.ArrayList;
import java.util.Collection;

public class CourseDAOImpl implements CourseDAO {

    private ArrayList<Course> courses = new ArrayList<>();

    public CourseDAOImpl() throws Exception {
        courses.add(new Course("Fizika", 5, 2));
        courses.add(new Course("Java programozás", 5, 4));
    }

    @Override
    public void createCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void modifyCourse(Course course) {
        String name = course.getName();
        for(int i = 0; i < courses.size(); i++) {
            if(name.equals(courses.get(i).getName())) {
                courses.set(i, course);
                break;
            }
        }
    }

    @Override
    public void removeCourse(Course course) {
        String name = course.getName();
        for(int i = 0; i < courses.size(); i++) {
            if(name.equals(courses.get(i).getName())) {
                courses.remove(i);
                break;
            }
        }
    }

    @Override
    public Collection<Course> searchAllCourse() {
        return courses;
    }

    @Override
    public Collection<Course> searchAllCourseByRecommendedSemester(int semester) {
        ArrayList<Course> results = new ArrayList<>();
        for(Course c : courses) {
            if(semester == c.getRecSem()) {
                results.add(c);
            }
        }
        return results;
    }

    @Override
    public Collection<Course> searchAllCourseByCredits(int credits) {
        ArrayList<Course> results = new ArrayList<>();
        for(Course c : courses) {
            if(credits == c.getRecSem()) {
                results.add(c);
            }
        }
        return results;
    }

    //TODO még meg kell oldani hogyan rendeljük össze a usereket és kurzusokat
    @Override
    public Collection<Course> searchAllCourseByUser(User user) {
        return courses;
    }

    @Override
    public Collection<Course> searchCourseByName(String name) {
        ArrayList<Course> results = new ArrayList<>();
        for(Course c : courses) {
            if(name.equals(c.getName())) {
                results.add(c);
            }
        }
        return results;
    }


}
