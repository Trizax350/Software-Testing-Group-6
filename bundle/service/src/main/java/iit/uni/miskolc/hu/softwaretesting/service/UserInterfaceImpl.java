package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.UserDAO;
import iit.uni.miskolc.hu.softwaretesting.model.User;

import java.util.Collection;

public class UserInterfaceImpl implements UserInterface {

    private UserDAO userDAO;

    public UserInterfaceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.modifyUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.removeUser(user);
    }

    @Override
    public Collection<User> getAllUser() {
        return userDAO.searchAllUser();
    }

    @Override
    public Collection<User> getAllUserByCourse(String course) {
        return userDAO.searchAllUserByCourse(course);
    }

    @Override
    public Collection<User> getAllUserWithOpenRequest() {
        return userDAO.searchAllUserWithOpenRequest();
    }

}
