package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.LoginFailed;

public interface LoginDAO {

    boolean checkCredentials(String username, String password) throws LoginFailed;

}
