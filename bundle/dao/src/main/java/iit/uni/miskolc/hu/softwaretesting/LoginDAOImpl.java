package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.LoginDAO;

public class LoginDAOImpl implements LoginDAO {

    @Override
    public boolean checkCredentials(String username, String password) {
        return true;
    }

}
