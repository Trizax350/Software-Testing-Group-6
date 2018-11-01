package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface UserInterface {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    Collection<User> getAllUser();
    Collection<User> getAllUserByCourse(String course);
    Collection<User> getAllUserWithOpenRequest();

}
