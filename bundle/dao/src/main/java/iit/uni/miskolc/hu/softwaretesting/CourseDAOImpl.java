package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public void createCourse(Course course) throws AlreadyExistsException {
        String name = course.getName();

        for(Course c : courses) {
            if(name.equals(c.getName())) throw new AlreadyExistsException("Ez  kurzus már létezik");
        }
        courses.add(course);
    }

    @Override
    public void modifyCourse(Course course) throws NotFoundException {
        String name = course.getName();
        boolean found = false;

        for(int i = 0; i < courses.size(); i++) {
            if(name.equals(courses.get(i).getName())) {
                found = true;
                courses.set(i, course);
                break;
            }
        }
        if(!found) throw new NotFoundException("Nem létezik ilyen kurzus");
    }

    @Override
    public void removeCourse(Course course) throws NotFoundException {
        String name = course.getName();
        boolean found = false;

        for(int i = 0; i < courses.size(); i++) {
            if(name.equals(courses.get(i).getName())) {
                found = true;
                courses.remove(i);
                break;
            }
        }
        if(!found) throw new NotFoundException("Nem létezik ilyen kurzus");
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
