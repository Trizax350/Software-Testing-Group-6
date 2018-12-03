package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.UserNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface UserInterface {

    void addUser(User user) throws AlreadyExistsException;
    void updateUser(User user) throws UserNotFoundException;
    void deleteUser(User user) throws UserNotFoundException;
    Collection<User> getAllUser();
    Collection<User> getAllUserByCourse(String course);
    Collection<User> getAllUserWithOpenRequest();

}