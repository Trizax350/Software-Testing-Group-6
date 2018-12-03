package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.CourseDAO;
import iit.uni.miskolc.hu.softwaretesting.dao.UserDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.UserNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UserDAOImpl implements UserDAO {

    private ArrayList<User> users = new ArrayList<>();

    private CourseDAOImpl courseDAOImpl = new CourseDAOImpl();

    private ArrayList<Course> allCourse = courseDAOImpl.getCourses();
    private ArrayList<Course> courses1 = new ArrayList<>(Arrays.asList(allCourse.get(0)));

    public UserDAOImpl() throws Exception {
        users.add(new Teacher(1, "Tanár bá", "tanar@email", "tanar1", "Tanar1", "Fizika", allCourse));
        users.add(new Student(2, "Valami diák", "diak@email", "diak1", "Diak1", Student.Status.ACTIVE, courses1));
        users.add(new Administrator(3, "Admin", "admin@email", "admin1", "Admin1"));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public void createUser(User user) throws AlreadyExistsException {
        int id = user.getId();
        String username = user.getUsername();
        for(User u : users) {
            if(id == u.getId() || username.equals(u.getUsername())) throw new AlreadyExistsException("Ez a felhasználó már létezik");
        }
        users.add(user);
    }

    @Override
    public void modifyUser(User user) throws UserNotFoundException {
        int id = user.getId();
        boolean found = false;

        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                found = true;
                users.set(i, user);
                break;
            }
        }
        if(!found) throw new UserNotFoundException("Ez a felhasználó nem létezik");
    }

    @Override
    public void removeUser(User user) throws UserNotFoundException {
        int id = user.getId();
        boolean found = false;

        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                found = true;
                users.remove(i);
                break;
            }
        }
        if(!found) throw new UserNotFoundException("Ez a felhasználó nem létezik");
    }

    @Override
    public Collection<User> searchAllUser() {
        return users;
    }

    @Override
    public Collection<User> searchAllUserByCourse(String course) {
        return users;
    }

    @Override
    public Collection<User> searchAllUserWithOpenRequest() {
        return users;
    }

}
