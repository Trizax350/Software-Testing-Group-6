package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.LoginDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;

public class LoginInterfaceImpl implements LoginInterface {

    private LoginDAO loginDAO;

    public LoginInterfaceImpl(){}

    public LoginInterfaceImpl(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean authenticate(String username, String password) throws LoginFailed {
        return loginDAO.checkCredentials(username, password);
    }


}
