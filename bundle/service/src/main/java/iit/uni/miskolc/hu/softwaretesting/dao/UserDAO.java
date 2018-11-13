package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface UserDAO {

    void createUser(User user);
    void modifyUser(User user);
    void removeUser(User user);
    Collection<User> searchAllUser();
    Collection<User> searchAllUserByCourse(String course);
    Collection<User> searchAllUserWithOpenRequest();

}