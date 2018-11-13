package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.LoginDAO;

public class LoginInterfaceImpl implements LoginInterface {

    private LoginDAO loginDAO;

    public LoginInterfaceImpl(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return loginDAO.checkCredentials(username, password);
    }

    @Override
    public boolean changePassword(String password) {
        return true;
    }

}
