package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.UserDAO;
import iit.uni.miskolc.hu.softwaretesting.model.*;

import java.util.ArrayList;
import java.util.Collection;

public class UserDAOImpl implements UserDAO {

    private ArrayList<User> users = new ArrayList<>();

    public UserDAOImpl() throws Exception {
        users.add(new Teacher(1, "Tanár bá", "tanar@email", "tanar1", "Tanar1", "Fizika"));
        users.add(new Student(2, "Valami diák", "diak@email", "diak1", "Diak1", Student.Status.ACTIVE));
        users.add(new Administrator(3, "Admin", "admin@email", "admin1", "Admin1"));
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }

    @Override
    public void modifyUser(User user) {
        int id = user.getId();
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                users.set(i, user);
                break;
            }
        }
    }

    @Override
    public void removeUser(User user) {
        int id = user.getId();
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                users.remove(i);
                break;
            }
        }
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
