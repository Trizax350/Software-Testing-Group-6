package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.UserNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public interface UserDAO {

    void createUser(User user) throws AlreadyExistsException;
    void modifyUser(User user) throws UserNotFoundException;
    void removeUser(User user) throws UserNotFoundException;
    Collection<User> searchAllUser();
    Collection<User> searchAllUserByCourse(String course);
    Collection<User> searchAllUserWithOpenRequest();

}